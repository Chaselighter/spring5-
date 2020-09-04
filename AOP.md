1.静态代理
2.动态代理
3.spring aop p配置
```xml
<aop:config>
        <aop:pointcut id="pointcut" expression="execution(* com.ljq.service.UserServiceImpl.*(..))"/>
        <aop:advisor advice-ref="logAfter" pointcut-ref="pointcut"></aop:advisor>
        <aop:advisor advice-ref="logBefore" pointcut-ref="pointcut"></aop:advisor>
    </aop:config>
```
4.spring 实现
方式一:使用官方api接口实现
方式二：使用自定义类做切面实现

```xml
<aop:config>
        <aop:aspect ref="diyaop">
            <aop:pointcut id="point" expression="execution(* com.ljq.service.UserServiceImpl.*(..))"/>
            <aop:after pointcut-ref="point" method="after"></aop:after>
            <aop:before method="before" pointcut-ref="point"></aop:before>
        </aop:aspect>
    </aop:config>
```
方式三：注解实现