package com.sample.comm;

import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderProcessServiceImpl implements BufferedReaderProcessService{

	@Override
	public String process(BufferedReader b) throws IOException {
		// TODO Auto-generated method stub
		return b.readLine() + b.readLine();
	}

}
