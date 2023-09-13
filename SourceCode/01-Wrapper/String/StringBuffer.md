# StringBuffer

## 构造器

``` java
StringBuffer() { // 调用父类构造器，new char[16]
  super(16);
} 

StringBuffer(int) {// 自己传一个容量
  super(capacity);
}

StringBuffer(String) { // 传一个字符串，长度再+16
  super(str.length() + 16);
  append(str);
}

StringBuffer(CharSequence seq) { // 字符串缓冲区+16----现在没学CharSequence，有时间再看
    this(seq.length() + 16);
    append(seq);
}
```

瞟了一眼，它的很多方法都加了synchronized，说明它具有**线程安全**的特点。
``` java
codePointAt(int index) { // 返回字符的ASCII码
    return super.codePointAt(index);
}
```

还有很多我以前没注意到的很有趣的方法
``` java
setLength(int) // 设置长度，如果我传的参小于当前length就会向后进行截串
reverse() // 逆置字符串并赋给自己
delete(start,end) // [start,end)
deleteCharAt(index) // 删除索引的值
// 还有一个需要注意的
StringBuffer s2 = new StringBuffer("123");
System.out.println(s2.length()+" "+s2.capacity());
length()和capacity()是不一样的，length是字符串(char[])的长度，capacity是容量
// 最后就是最复杂的append，它调用的是父类的append，返回的是this对象，也就是说可以链式调用
// 父类的
public AbstractStringBuilder append(String str) {
    if (str == null)
        return appendNull(); // 很有趣，你传一个null他就真在后面给你加"null"，主打一个实诚
    int len = str.length();
    ensureCapacityInternal(count + len); // count就是字符串的length，加上需要追加字符串的长度
    str.getChars(0, len, value, count);
    count += len;
    return this;
}
private void ensureCapacityInternal(int minimumCapacity) { // 需要的最小容量，这俩加起来可能会溢出
    // overflow-conscious code
    // value.length是capacity，min比它小就不需要扩容了
    if (minimumCapacity - value.length > 0) { // 这里有疑问
        value = Arrays.copyOf(value,
                newCapacity(minimumCapacity)); // 这一步就是扩容了。把原来的字符串放到新的里
    }
}
private int newCapacity(int minCapacity) {
    // overflow-conscious code
    int newCapacity = (value.length << 1) + 2; // * 2 + 2
    if (newCapacity - minCapacity < 0) { // 新的容量如果小于预定最小容量，就把min赋给new
        newCapacity = minCapacity; 
    }
    // newCapacity <= 0对应之前min的溢出问题，
    // 或在MAX_ARRAY_SIZE和Integer_max之间（接近溢出），就hugeCapacity（比MAX_ARRAY_SIZE大就赋MAX_ARRAY_SIZE）
    // 我觉得这段代码块的意思就是控制不让容量溢出，最大只能有MAX_ARRAY_SIZE
    return (newCapacity <= 0 || MAX_ARRAY_SIZE - newCapacity < 0) 
        ? hugeCapacity(minCapacity)
        : newCapacity;
}
```