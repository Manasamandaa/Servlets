# Servlets

* it is a server side program which takes the request from the client,process it and sends the response back
  to the client.
* servlet is a web component or java enterprise component.
* If you want to write a servlet.You have to create web application.

# Steps to create web application
1. create a folder(context root) in C:\Program Files\Apache Software Foundation\Tomcat 10.1\webapps
2. create a WEB-INF folder in context root(WebApp1)
3. create classes,lib folder in WEB-INF folder.
4. create web.xml file in WEB-INF folder.
   
  web.xml file is also called as Deployment Descriptor.

# There are five abstract methods in servlets
  1. public abstract void init();
  2. public abstract getServletConfig();
  3. public abstract void service();
  4. public abstract getServletInfo();
  5. public abstract void destroy();

init(),service(),destroy()methods are life cycle methods.
* servlets are created and destroyed by a servlet engine

init() is invoke by servlet engine the time of servlet creation(i.e object creation).
service() is invoked each time when a new request is coming to the servlet.
destroy() is called by servlet container at the time of servlet get destroyed.
