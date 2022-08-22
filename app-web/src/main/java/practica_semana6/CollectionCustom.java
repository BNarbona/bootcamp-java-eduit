package practica_semana6;

public abstract class CollectionCustom <T> {
	
	protected T [] tipos;
	
	public CollectionCustom(T[] tipos) {
		if (tipos != null) {
			this.tipos = tipos;
		}
	}

	
	public abstract int size();
	
	public abstract void addFirst (T elemento);
	
	public abstract void addLast (T elemento);
	
	public abstract T remove (T elemento);
	
	public abstract void removeAll();
	
	public abstract boolean empty ();
	

	
}
