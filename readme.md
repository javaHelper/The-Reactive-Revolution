# The Reactive Revolution

Join Spring developer advocate Josh Long for a look at what Spring Boot is, why it's turning heads, 
why you should consider it for your next application (REST, micro services, web, batch, big data, integration, whatever!) and how to get started.

```sql
select * from public.reservation;

id|name   |
--+-------+
 1|Neha   |
 2|Aravind|
 3|Laxmi  |
 4|Rajesh |
 5|Anosh  |
 6|Sam    |
 7|Alex   |
 ```
 
 Response below when client App runs
 
 ```java
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.0)

2022-07-21 16:35:04.620  INFO 24414 --- [           main] c.e.demo.ReactiveClientApplication       : Starting ReactiveClientApplication using Java 11.0.13 on Prateeks-MacBook-Pro.local with PID 24414 (/Users/prats/Documents/workspace/reactive-client/target/classes started by prateekashtikar in /Users/prats/Documents/workspace/reactive-client)
2022-07-21 16:35:04.626  INFO 24414 --- [           main] c.e.demo.ReactiveClientApplication       : No active profile set, falling back to 1 default profile: "default"
2022-07-21 16:35:05.679  INFO 24414 --- [           main] o.s.cloud.context.scope.GenericScope     : BeanFactory id=1a718947-9ac5-3a86-b91c-843c1f731e7e
2022-07-21 16:35:07.188  INFO 24414 --- [           main] c.e.demo.ReactiveClientApplication       : Started ReactiveClientApplication in 3.241 seconds (JVM running for 4.361)
2022-07-21 16:35:07.775  INFO 24414 --- [ctor-http-nio-2] com.example.demo.config.AppConfig        : Neha
2022-07-21 16:35:07.776  INFO 24414 --- [ctor-http-nio-2] com.example.demo.config.AppConfig        : Aravind
2022-07-21 16:35:07.776  INFO 24414 --- [ctor-http-nio-2] com.example.demo.config.AppConfig        : Laxmi
2022-07-21 16:35:07.777  INFO 24414 --- [ctor-http-nio-2] com.example.demo.config.AppConfig        : Rajesh
2022-07-21 16:35:07.777  INFO 24414 --- [ctor-http-nio-2] com.example.demo.config.AppConfig        : Anosh
2022-07-21 16:35:07.777  INFO 24414 --- [ctor-http-nio-2] com.example.demo.config.AppConfig        : Sam
2022-07-21 16:35:07.777  INFO 24414 --- [ctor-http-nio-2] com.example.demo.config.AppConfig        : Alex
2022-07-21 16:35:08.710  INFO 24414 --- [actor-tcp-nio-2] c.e.demo.ReactiveClientApplication       : GreetingResponse(message=Hello All the Talks @ 2022-07-21T11:05:07.663746Z)
2022-07-21 16:35:09.706  INFO 24414 --- [actor-tcp-nio-2] c.e.demo.ReactiveClientApplication       : GreetingResponse(message=Hello All the Talks @ 2022-07-21T11:05:08.694321Z)
2022-07-21 16:35:10.719  INFO 24414 --- [actor-tcp-nio-2] c.e.demo.ReactiveClientApplication       : GreetingResponse(message=Hello All the Talks @ 2022-07-21T11:05:09.703407Z)
2022-07-21 16:35:11.730  INFO 24414 --- [actor-tcp-nio-2] c.e.demo.ReactiveClientApplication       : GreetingResponse(message=Hello All the Talks @ 2022-07-21T11:05:10.717135Z)
 ```
