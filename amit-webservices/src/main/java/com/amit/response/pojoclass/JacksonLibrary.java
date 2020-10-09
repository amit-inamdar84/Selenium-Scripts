package com.amit.response.pojoclass;

public class JacksonLibrary {
/*    **use jackson to parse json to java**

    <dependency>
       <groupId>com.fasterxml.jackson.core</groupId>
       <artifactId>jackson-databind</artifactId>
          <version>2.7.4</version>
   </dependency>

**creat Post.java** 
**By using map you don't need to create separate pojo classes**
package parser;

import java.util.Date;
import java.util.Map;

public class Post {
   private int id;
   private Date date;
   private Date date_gmt;
   private Map<String, String> guid;
   private Map<String, String> title;
   private Date modified;
   private Date modified_gmt;
   private String slug;
   private String status;
   private String type;
   private String link;
   Getter and Setter Methods
   public int getId() {
       return id;
   }
   public void setId(int id) {
       this.id = id;
   }
   public String getType() {
       return type;
   }
   public void setType(String type) {
       this.type = type;
   }
   public String getLink() {
       return link;
   }
   public void setLink(String link) {
       this.link = link;
   }

   public String getSlug() {
       return slug;
   }
   public void setSlug(String slug) {
       this.slug = slug;
   }
   public String getStatus() {
       return status;
   }
   public void setStatus(String status) {
       this.status = status;
   }

   public Date getModified() {
       return modified;
   }
   public void setModified(Date modified) {
       this.modified = modified;
   }
   public Date getModified_gmt() {
       return modified_gmt;
   }
   public void setModified_gmt(Date modified_gmt) {
       this.modified_gmt = modified_gmt;
   }
   public Date getDate() {
       return date;
   }
   public void setDate(Date date) {
       this.date = date;
   }
   public Date getDate_gmt() {
       return date_gmt;
   }
   public void setDate_gmt(Date date_gmt) {
       this.date_gmt = date_gmt;
   }

   public Map<String, String> getGuid() {
       return guid;
   }
   public void setGuid(Map<String, String> guid) {
       this.guid = guid;
   }
   public Map<String, String> getTitle() {
       return title;
   }
   public void setTitle(Map<String, String> title) {
       this.title = title;
   }
   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("\n-----Post Information-----\n");
       sb.append("Date Gmt: " + getDate_gmt() + "\n");
       sb.append("Date: " + getDate() + "\n");
       sb.append("Modified Gmt: " + getModified_gmt() + "\n");
       sb.append("Status: " + getStatus() + "\n");
       sb.append("ID: " + getId() + "\n");
       sb.append("Guid: " + getGuid() + "\n");
       sb.append("Title:" + getTitle() + "\n");
       sb.append("Slug: " + getSlug() + "\n");
       sb.append("Type: " + getType() + "\n");
       sb.append("*****************************");
       return sb.toString();
   }
}  

Then create Main class and i am reading json data  from file
My file Json data as input-:
{
"id": 11881,
"date": "2018-03-26T16:22:08",
"date_gmt": "2018-03-26T14:22:08",
"guid": {
"rendered": "http://google.com"
},
"modified": "2018-03-26T16:22:08",
"modified_gmt": "2018-03-26T14:22:08",
"slug": "some text",
"status": "some status",
"type": "post",
"link": "http://google.com",
"title": {
"rendered": "some title"
}
}


package parser;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {
public static void main(String[] args) {
ObjectMapper objectMapper=new ObjectMapper();
try {
    Post emp = objectMapper.readValue(new File("Q://employee.json"), Post.class);
   System.out.println(emp.toString());
} catch (JsonParseException e) {
   e.printStackTrace();
} catch (JsonMappingException e) {
   e.printStackTrace();
} catch (IOException e) {
   e.printStackTrace();
}

}
}

---------------output--------------------------
-----Post Information-----
Date Gmt: Mon Mar 26 19:52:08 IST 2018
Date: Mon Mar 26 21:52:08 IST 2018
Modified Gmt: Mon Mar 26 19:52:08 IST 2018
Status: some status
ID: 11881
Guid: {rendered=http://google.com}
Title:{rendered=some title}
Slug: some text
Type: post
******************************/
	

}
