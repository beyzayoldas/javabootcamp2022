package stringsDemo;
//string:metin
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayısı : "+mesaj.length());
		System.out.println("5.eleman: " +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("b")); //java küçük büyük harf duyarlı bir dildir
		System.out.println(mesaj.endsWith("."));
		char[]karakterler = new char[5];
		mesaj.getChars( 0, 5 ,karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('e'));*/
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4)); //parçalama 2.indexten sonrayı kes 4.indexe kadar
		for(String kelime : mesaj.split(" ")) { //metindeki sözcükleri alt alta yazıyor
			
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase() ); //küçük harfe çeviriyor
		System.out.println(mesaj.toUpperCase()); //büyük harfe çeviriyor
		System.out.println(mesaj.trim()); //başındaki ve sonundaki boşlukları atıyor
		
	}

}
