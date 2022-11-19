package patikaStore.business.abstracts;

public interface IProductService {
/*
 * Kullanıcı ürün ekleyebilmeli ve ürünün grubunu (Cep Telefonu, Notebook vb.) seçebilmeli.
Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.
Kullanıcı ürünlerin benzersiz numaralarına ve markalarına göre filtreleyip listeleyebilmeli.
 */
	void add();
	void delete();
	void filter();
}
