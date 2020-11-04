package ex10accessmodifier;

class Rectangle
{
	// 10 10 -1 -1
	//멤버변수
   	private int ulx, uly;//좌상단(upper left x, upper left y)
   	private int lrx, lry;//우하단(lower right x, lower right y)
   	private boolean flag = true;
   	private int area;

   	//생성자
   	public Rectangle(int ulx, int uly, int lrx, int lry) {
   		
   		if(isRange(ulx) == false || isRange(uly)==false) {
   			System.out.println("좌상단 좌표범위가 잘못되었습니다.");
   			flag = false;
   		}
   		if(isRange(lrx) == false || isRange(lry) == false) {
   			System.out.println("우상단 좌표 범위가 잘못되었습니다");
   			flag = false;
   		}
   		if(ulx >= lrx || uly >= lry) {
   			System.out.println("좌측 우측 좌표지정이 잘못되었습니다.");
   			flag = false;
   		}
   		
   		if(flag == true) {
   			this.ulx = ulx;
   			this.uly = uly;
   			this.lrx = lrx;
   			this.lry = lry;
   		}
   		
//   		if(ulx<=0 || uly<=0 || ulx>=100 || uly>=100) {		// 좌상단 검사
//   			System.out.println("좌상단 좌표 범위가 잘못되었습니다");
//   			flag = false;
//   		}
//   		if(lrx<=0 || lry<=0 || lrx>=100 || lry>=100) {		// 우상단 검사
//   			System.out.println("우상단 좌표 범위가 잘못되었습니다");
//   			flag = false;
//   		}
//   		if(lrx<=ulx && lry<=uly) {							// 좌상단 < 우상단인지 검사
//   			System.out.println("좌측 우측 좌표지정이 잘못되었습니다.");
//   			flag = false;
//   		}
//   		if(flag == true) {
//   			this.ulx = ulx;
//   			this.uly = uly;
//   			this.lrx = lrx;
//   			this.lry = lry;
//   		}
   		
   	}   	   	
   	
   	public boolean isRange(int point) {
   		if(point<0 || point>100)
   			return false;
   		else
   			return true;
   	}
   	
	public void showArea()
   	{
		if(flag == false) {
			System.out.println("좌표값 오류로 넓이를 계산할 수 없습니다.");
			return;
		}
		else {
			area = (lrx-ulx) * (lry-uly);
			System.out.println("넓이 : " + area);
		}
   	}  	
}

class QuRectangle
{
   	public static void main(String[] args)
   	{
		//여기부터
//     		Rectangle rec = new Rectangle();
//     		rec.ulx=22;
//     		rec.uly=22;
//     		rec.lrx=10;
//     		rec.lry=10;
		//여기까지는 정보은닉후 실행되지 않게 해야한다....

		//아래 생성자로만 객체생성후 초기화 되도록 처리한다...
		Rectangle rec1 = new Rectangle(1,1,10,10);
		rec1.showArea();
		
		Rectangle rec2 = new Rectangle(-2,-2,101,101);
		rec2.showArea();
		
		Rectangle rec3 = new Rectangle(10,10,1,1);
		rec3.showArea();
		
   	}
}
