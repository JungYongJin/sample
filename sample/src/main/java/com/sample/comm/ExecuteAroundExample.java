package com.sample.comm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class ExecuteAroundExample {

	// 로그 설정 프로퍼티 파일명 
	private static final String PROPERTIES = "SampleLogger.properties";
	private static Logger logger = null;
	
	private static final String FILE = ExecuteAroundExample.class.getResource("./data.txt").getFile();
	
	static {
		try {
			
			
			logger = Logger.getLogger(ExecuteAroundExample.class.getName());
			logger.log(Level.INFO,"로그설정 프로퍼티 파일: " + PROPERTIES + " 를 바탕으로 로그를 설정");
			final InputStream inputStm = ExecuteAroundExample.class.getResource("./SampleLogger.properties").openStream();
			if(inputStm == null) {
				logger.info("로그 설정: " + PROPERTIES + " 는 클래스 패스 상에서 찾을 수 없습니다.");
			}else {
				try {
					LogManager.getLogManager().readConfiguration(inputStm);
					logger.info("로그 설정 완료: LogManager를 설정했습니다.");
				}catch(IOException e) {
					logger.warning("로그 설정 실패: LogManager설정 시에" + "예외가 발생했습니다:" + e.toString());
				}finally {
					try {
						if(inputStm != null) {
							inputStm.close();
						}
					}catch(IOException e) {
						logger.warning("");
					}
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String...strings) throws Exception{
		String result = processFileLimited();
		logger.log(Level.INFO, result);
		
		
		String result2 = processFile((b) -> b.readLine() + "\n" + b.readLine());
		logger.log(Level.INFO, result2);
		
		BufferedReaderProcessService brps = new BufferedReaderProcessServiceImpl();
		String result3 = processFile(brps);
		logger.log(Level.INFO, result3);
		
		BufferedReaderProcessService brps2 = (b) -> b.readLine() + b.read();
		String result4 = processFile(brps2);
		logger.log(Level.INFO, result4);
		
		Predicate<String> pre = (String s) -> s.equals("Test");
	}
	
	public static String processFileLimited() throws IOException, URISyntaxException{
		URI uri = ExecuteAroundExample.class.getResource("./data.txt").toURI();
		String strPath = ExecuteAroundExample.class.getResource("./data.txt").getFile();
		logger.info(uri.getPath());
		logger.info(strPath);
		Path path = Paths.get(ExecuteAroundExample.class.getResource("./data.txt").toURI());
		try (BufferedReader br = Files.newBufferedReader(path)){
			return br.readLine();
		}
	}
	
	public static String processFile(BufferedReaderProcessService br) throws IOException{
		try(BufferedReader b = new BufferedReader(new FileReader(FILE))){
			return br.process(b);
		}
	}
	
}
