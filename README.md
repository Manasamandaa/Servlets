# Servlets

*it is a server side program which takes the request from the client,process it and sends the response back
to the client.
* servlet is a web component or java enterprise component.
*If you want to write a servlet.You have to create web application.

Steps to create web application
1.create a folder(context root) in C:\Program Files\Apache Software Foundation\Tomcat 10.1\webapps
2.create a WEB-INF folder in context root(WebApp1)
3.create classes,lib folder in WEB-INF folder.
4.create web.xml file in WEB-INF folder.
  web.xml file is also called as Deployment Descriptor.

# Where to write .html,.css and .js files?
Ans:-Context Root

# Where to write .java Programs? 
Ans:- in classes folder

# What an lib folder contains?
Ans:-.jar file

To write a servlet we have to use servlet api
# Where we can find servlet api?
C:\Program Files\Apache Software Foundation\Tomcat 10.1\lib\servelet-api.jar

There are five abstract methods in servlets

  public abstract void init();
  public abstract getServletConfig();
  public abstract void service();
  public abstract getServletInfo();
  public abstract void destroy();

init(),service(),destroy()methods are life cycle methods.

* servlets are created and destroyed by a servlet engine

init() is invoke by servlet engine the time of servlet creation(i.e object creation).
service() is invoked each time when a new request is coming to the servlet.
destroy() is called by servlet container at the time of servlet get destroyed.
