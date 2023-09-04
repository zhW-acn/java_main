JAVASE
==
# 1.标识符
## 1.构成：数字，下划线，$，英文。不能以数字开头
## 2.命名规范：
* 包名：全小写，域名倒置`com.acn....`
* 类：首字母大写
* 变量：驼峰式
* 常量：全大写
# 2.分隔符
* 空格
* 逗号
* 分号
* 冒号
* 点
* 大括号
* 中括号
* 小括号
* 引号
* ->：lambda表达式箭头函数
* <>：泛型
# 3.数据类型
## 1.基本类型
* 数值：
  * 整数：8-byte  16-short  32-int  64-long[0l] 
  * 浮点：32-float[0.0f] 64-double[0.0] --金钱×
* 布尔：1-boolean[false]
* 字符：16-char -不论中英文，只赋值一个字符
## 2.引用类型（类）
* 字符串
* 枚举
* 包装类[null]
## 3.装箱与拆箱
```java
//自动装箱，拆箱
Integer = int
int = Integer
//手动装箱
int = new Integer(num)
//手动拆箱
int = Integer.inValue()
```
## 4.类型转换
***引用类型转换必须是继承关系***
* 自动类型转换（向上）
* 强制类型转换（向下）  `()超过容量会数据溢出&丢失精度`
* 整数和字符型需要强转
~~~java
int i = 200;
byte b = (byte)i;
System.out.println(b);// -56
Object str = "123";
Integer i = (Integer) str;
~~~

## 5.比较
* == 判断类型地址
* equals() 引用类型的匹配方法
* 
