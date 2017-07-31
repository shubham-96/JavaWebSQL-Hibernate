package com.ideas;

import static org.junit.Assert.*;

import java.io.IOException;

import org.eclipse.jetty.testing.HttpTester;
import org.eclipse.jetty.testing.ServletTester;
import org.junit.Test;

public class NameServletTest {
	
	@Test
	public void testDoGet() throws IOException, Exception {
		ServletTester tester = new ServletTester();
		tester.addServlet(NameServlet.class, "/");
		tester.start();
		
		HttpTester req = new HttpTester();
		req.setMethod("GET");
		req.setURI("/");
		req.setVersion("HTTP/1.0");
		
		HttpTester resp = new HttpTester();
		
		resp.parse(tester.getResponses(req.generate()));
		assertEquals(200, resp.getStatus());
		assertEquals("Get Hello", resp.getContent());
	}
	
	@Test
	public void testDoPost() throws IOException, Exception {
		ServletTester tester = new ServletTester();
		tester.addServlet(NameServlet.class, "/");
		tester.start();
		
		HttpTester req = new HttpTester();
		req.setMethod("POST");
		req.setURI("/");
		req.setVersion("HTTP/1.0");
		
		HttpTester resp = new HttpTester();
		
		resp.parse(tester.getResponses(req.generate()));
		assertEquals(200, resp.getStatus());
		assertEquals("Post Hello", resp.getContent());
		
	}
}
