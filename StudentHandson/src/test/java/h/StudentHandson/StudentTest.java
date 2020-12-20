package h.StudentHandson;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
class StudentTest {

	@Autowired
	StudentDao dao;
	
	static List<Student> std=List.of(new Student("pia",1,"it","a"));
	
	//juint test case 
	
	@Test
	void TestSave() {
		dao.save(std.get(0));
		List<Student> l=new ArrayList<Student>();
		dao.findAll().forEach(c->l.add(c));
		assertEquals(1,l.size());
	}
	
	

}
