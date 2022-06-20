Feature: Customer melakukan pembelian
	Scenario: Testing Pembelian Customer
		When Customer menambah produk
		Then Customer berhasil menambah produk
		When Customer melihat detail dari baju yang dipilih
		Then Custer berhasil masuk ke detail baju yang dipilih