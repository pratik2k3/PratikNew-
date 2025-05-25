package com.example.demoDocumentController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoDocumentService.DocumentService;
import com.example.demoDocumentService.PdfServiceImpl;

@RestController
public class DocumentController {

	@GetMapping("print")
	public String printInvoice() {
		DocumentService ds = new PdfServiceImpl();
		ds.readDataFromDb();
		ds.processData();
		return ds.printData();

	}
}
