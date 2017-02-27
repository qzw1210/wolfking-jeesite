(1)运行主类
    com.wolfking.jeesite.WolfkingJeesiteDriver
    http://127.0.0.1:9090/admin/login
    application.yml 里面配置了adminPath , 127路径中的可以修改
(2)砍掉了所有的冗余的东西,只保留系统配置
   数据库脚本 wolfking-jeesite.sql
(3)使用springboot集成
   使用HikariDataSource数据源
(4)mvn install 打包运行
    java -jar wolfking-jeesite-1.0.0-SNAPSHOT.war
(5)如果使用外置的配置文件，在启动参数添加
    java -jar --spring.config.location=./application.yml wolfking-jeesite-1.0.0-SNAPSHOT.war
(6)由于boot对jsp的集成问题
    只能用tomcat 和jetty 启动，undertow 有问题
(7)默认用户名，密码  admin admin

