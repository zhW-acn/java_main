1. 目录结构
```
|----pacage
        |----dao(POJO的抽象类，里面定义DML、DQL语句方法。xxxDao)
            |----impl(dao接口的实现类，实现对应dao层的抽象方法。xxxDaoImpl)
                
        |----entry(POJO类，对应数据库的一张表。属性对应列名，上方用JavaDoc注释)
            
        |----test(测试)
        
        |----util(工具类，JDBC的统一流程)
                
```