 REQUIRED：支持当前事务，如果当前没有事务，就新建一个事务。这是最常见的选择。 

 SUPPORTS：支持当前事务，如果当前没有事务，就以非事务方式执行。 

 MANDATORY：支持当前事务，如果当前没有事务，就抛出异常。 

 REQUIRES_NEW：新建事务，如果当前存在事务，把当前事务挂起。 

 NOT_SUPPORTED：以非事务方式执行操作，如果当前存在事务，就把当前事务挂起。 

 NEVER：以非事务方式执行，如果当前存在事务，则抛出异常。 

 NESTED：支持当前事务，如果当前事务存在，则执行一个嵌套事务，如果当前没有事务，就新建一个事务。 
 
 
 1.声明式事务
 ```xml
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="datasource"></property>
    </bean>

    <!--    <bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate">-->
<!--        <constructor-arg index="0" ref="sqlSessionFactory"></constructor-arg>-->
<!--    </bean>-->
    <tx:advice id="txAdvice" transaction-manager="transactionManager">
        <tx:attributes>
<!--            <tx:method name="add" propagation="REQUIRED"/>-->
<!--            <tx:method name="delete" propagation="REQUIRED"></tx:method>-->
<!--            <tx:method name="update" propagation="REQUIRED"></tx:method>-->
<!--            <tx:method name="query" read-only="true"></tx:method>-->
            <tx:method name="*" propagation="REQUIRED"></tx:method>
        </tx:attributes>
    </tx:advice>
    <aop:config>
        <aop:pointcut id="txpointcut" expression="execution(* com.ljq.mapper.*.*(..))"/>
        <aop:advisor advice-ref="txAdvice" pointcut-ref="txpointcut"></aop:advisor>
    </aop:config>
    <aop:aspectj-autoproxy></aop:aspectj-autoproxy>
```
 2.编程式事务