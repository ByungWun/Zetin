package com.getDirection;

//Vertex Class
public class Vertex {
	  final private String id;   //id
	  final private String name; //name
	  final float x;			 //Point x
	  final float y;			 //Point y
	  
	  //생성자
	  public Vertex(String id, String name, float x, float y) {
	    this.id = id;
	    this.name = name;
	    this.x = x;
	    this.y = y;
	  }
	  
	  public String getId() {//get Id of Vertex
	    return id;
	  }

	  public String getName() {//get Name of Vertex
	    return name;
	  }
	  
	  public float getX(){     //get Point x pixel
		  return x;
	  }
	  
	  public float getY(){		//get Point y pixel
		  return y;
	  }
	  
	  @Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + ((id == null) ? 0 : id.hashCode());
	    return result;
	  }
	  
	  @Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    Vertex other = (Vertex) obj;
	    if (id == null) {
	      if (other.id != null)
	        return false;
	    } else if (!id.equals(other.id))
	      return false;
	    return true;
	  }

	  @Override
	  public String toString() {
	    return name;
	  }
	  
	}