package common;

/**
 * 공통적으로 사용되는 내용 중 다운로드 모드.
 * UI에서 connector를 호출할 때 매개변수로 넘겨준다.
 * @author occidere
 *
 */
public interface DownloadMod {
	public static final int ALL_DOWNLOAD = 10;
	public static final int SINGLE_DOWNLOAD = 20;
	public static final int SELECTIVE_DOWNLOAD = 30;
}
/* 
변경사항
1. 오타 수정
*/