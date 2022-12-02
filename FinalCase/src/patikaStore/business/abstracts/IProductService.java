package patikaStore.business.abstracts;

public interface IProductService {
	//methods can be change or deleted in future but it doesn't effect manager class. Inteface is used for this.
		
		public   void add() ;		
		
		public   void delete();
		
		public   void listBy();
				
		public String getByCategory();
		

}
