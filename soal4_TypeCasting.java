/**
 * Nama Program: soal4_ConvertDataType
 * Tujuan Program: Mendemonstrasikan proses Narrowing Casting berantai dari tipe data
 * terbesar (double) hingga terkecil (byte) dan efeknya terhadap nilai desimal.
 * * * Input: 
 * - Variabel double d = 10.25 (Hardcoded).
 * * * Output:
 * - Menampilkan nilai akhir byte b setelah melalui berbagai tahap konversi.
 */

class soal4_ConvertDataType {
	static short methodOne(long l) {
		int i = (int) l; return (short)i;
	}

	public static void main(String[] args) {
		double d = 10.25; float f = (float) d;
		byte b = (byte) methodOne((long) f); System.out.println(b);
	}
}
