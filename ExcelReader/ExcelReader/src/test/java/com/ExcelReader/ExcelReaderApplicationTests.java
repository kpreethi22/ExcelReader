package com.ExcelReader;

import com.ExcelReader.util.ExcelReader;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExcelReaderApplicationTests {

	@Test
	void contextLoads() {
		ExcelReader excel= new ExcelReader();
		excel.readExcel();
	}

}
