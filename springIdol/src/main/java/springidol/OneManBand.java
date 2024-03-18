package springidol;

import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {
	private Map<String, Instrument> instruments; /*타임을 map으로 변경*/


	public OneManBand() {
	}

	public void setInstruments(Map<String, Instrument> instruments)  {
		this.instruments = instruments;
	} /* setter도 map 에 맞게 변경*/

	@Override
	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print(key + " : " );
			instruments.get(key).play(); /*map 타입에 맞게 객체 함수 실행*/
		}
	}

}
