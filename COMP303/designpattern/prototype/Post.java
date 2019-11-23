package prototype;

/*
 * Assume we have a blog system where we can post our blogs and notes. Object classes like Blog and 
 * Note implements Post interface so that users can create a prototype efficiently.
 */
public interface Post extends Cloneable{
	
	public Post makeCopy();

}
