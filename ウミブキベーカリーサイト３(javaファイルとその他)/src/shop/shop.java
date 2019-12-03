package shop;

public class shop 
{
	
	private int shopid;
	private String shoppingdate;
	private String userid;
	private String username;
	private String usergender;
	private String useremail;
	private String customname;
	private String customaddress1;
	private String customaddress2;
	private String tel1;//int로 바꿔주는 작업(shoppingaction2.jsp)이 있으므로 일단 String으로 처리함.
	private String tel2;
	private String tel3;
	private String hope;
	private int normalplain;
	private int nutplain;
	private int chocoplain;
	private int milkplain;
	private int cornplain;
	private int chococake;
	private int creamcake;
	private int berrycake;
	private int cheesecake;
	private int sweetpotatocake;
	private int creamplus;
	private int creamless;
	private int chococorone;
	private int pumpkincorone;
	private int berrycorone;
	private int beanbread;
	private int chocomuffin;
	private int planemuffin;
	private int honeymuffin;
	private int potatokoroke;
	private int currykoroke;
	private int vegekoroke;
	private int croissant;
	private int chococroissant;
	private int almondcroissant;
	private int vegesandwich;
	private int chickensandwich;
	private int beefsandwich;
	private int hamsandwich;
	private int eggsandwich;
	private int choucream;
	private int cheesetart;
	private int eggtart;
	private int walnuttart;
	private int planemakaron;
	private int chocomakaron;
	private int berrymakaron;
	private int cheesemakaron;
	private int greenmakaron;
	private int dacquoise;
	private int chocochip;
	private int sabre;
	private int chocosabre;
	private int gingerbread;
	private int totalprice;
	
	public int getShopid() {
		return shopid;
	}
	public void setShopid(int shopid) {
		this.shopid = shopid;
	}
	public String getShoppingdate() {
		return shoppingdate;
	}
	public void setShoppingdate(String shoppingdate) {
		this.shoppingdate = shoppingdate;
	}
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsergender() {
		return usergender;
	}
	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getCustomname() {
		return customname;
	}
	public void setCustomname(String customname) {
		this.customname = customname;
	}
	public String getCustomaddress1() {
		return customaddress1;
	}
	public void setCustomaddress1(String customaddress1) {
		this.customaddress1 = customaddress1;
	}
	public String getCustomaddress2() {
		return customaddress2;
	}
	public void setCustomaddress2(String customaddress2) {
		this.customaddress2 = customaddress2;
	}

	public String getHope() {
		return hope;
	}
	public void setHope(String hope) {
		this.hope = hope;
	}
	public int getNormalplain() {
		return normalplain;
	}
	public void setNormalplain(int normalplain) {
		this.normalplain = normalplain;
	}
	public int getNutplain() {
		return nutplain;
	}
	public void setNutplain(int nutplain) {
		this.nutplain = nutplain;
	}
	public int getChocoplain() {
		return chocoplain;
	}
	public void setChocoplain(int chocoplain) {
		this.chocoplain = chocoplain;
	}
	public int getMilkplain() {
		return milkplain;
	}
	public void setMilkplain(int milkplain) {
		this.milkplain = milkplain;
	}
	public int getCornplain() {
		return cornplain;
	}
	public void setCornplain(int cornplain) {
		this.cornplain = cornplain;
	}
	public int getChococake() {
		return chococake;
	}
	public void setChococake(int chococake) {
		this.chococake = chococake;
	}
	public int getCreamcake() {
		return creamcake;
	}
	public void setCreamcake(int creamcake) {
		this.creamcake = creamcake;
	}
	public int getBerrycake() {
		return berrycake;
	}
	public void setBerrycake(int berrycake) {
		this.berrycake = berrycake;
	}
	public int getCheesecake() {
		return cheesecake;
	}
	public void setCheesecake(int cheesecake) {
		this.cheesecake = cheesecake;
	}
	public int getSweetpotatocake() {
		return sweetpotatocake;
	}
	public void setSweetpotatocake(int sweetpotatocake) {
		this.sweetpotatocake = sweetpotatocake;
	}
	public int getCreamplus() {
		return creamplus;
	}
	public void setCreamplus(int creamplus) {
		this.creamplus = creamplus;
	}
	public int getCreamless() {
		return creamless;
	}
	public void setCreamless(int creamless) {
		this.creamless = creamless;
	}
	public int getChococorone() {
		return chococorone;
	}
	public void setChococorone(int chococorone) {
		this.chococorone = chococorone;
	}
	public int getPumpkincorone() {
		return pumpkincorone;
	}
	public void setPumpkincorone(int pumpkincorone) {
		this.pumpkincorone = pumpkincorone;
	}
	public int getBerrycorone() {
		return berrycorone;
	}
	public void setBerrycorone(int berrycorone) {
		this.berrycorone = berrycorone;
	}
	public int getBeanbread() {
		return beanbread;
	}
	public void setBeanbread(int beanbread) {
		this.beanbread = beanbread;
	}
	public int getChocomuffin() {
		return chocomuffin;
	}
	public void setChocomuffin(int chocomuffin) {
		this.chocomuffin = chocomuffin;
	}
	public int getPlanemuffin() {
		return planemuffin;
	}
	public void setPlanemuffin(int planemuffin) {
		this.planemuffin = planemuffin;
	}
	public int getHoneymuffin() {
		return honeymuffin;
	}
	public void setHoneymuffin(int honeymuffin) {
		this.honeymuffin = honeymuffin;
	}
	public int getPotatokoroke() {
		return potatokoroke;
	}
	public void setPotatokoroke(int potatokoroke) {
		this.potatokoroke = potatokoroke;
	}
	public int getCurrykoroke() {
		return currykoroke;
	}
	public void setCurrykoroke(int currykoroke) {
		this.currykoroke = currykoroke;
	}
	public int getVegekoroke() {
		return vegekoroke;
	}
	public void setVegekoroke(int vegekoroke) {
		this.vegekoroke = vegekoroke;
	}
	public int getCroissant() {
		return croissant;
	}
	public void setCroissant(int croissant) {
		this.croissant = croissant;
	}
	public int getChococroissant() {
		return chococroissant;
	}
	public void setChococroissant(int chococroissant) {
		this.chococroissant = chococroissant;
	}
	public int getAlmondcroissant() {
		return almondcroissant;
	}
	public void setAlmondcroissant(int almondcroissant) {
		this.almondcroissant = almondcroissant;
	}
	public int getVegesandwich() {
		return vegesandwich;
	}
	public void setVegesandwich(int vegesandwich) {
		this.vegesandwich = vegesandwich;
	}
	public int getChickensandwich() {
		return chickensandwich;
	}
	public void setChickensandwich(int chickensandwich) {
		this.chickensandwich = chickensandwich;
	}
	public int getBeefsandwich() {
		return beefsandwich;
	}
	public void setBeefsandwich(int beefsandwich) {
		this.beefsandwich = beefsandwich;
	}
	public int getHamsandwich() {
		return hamsandwich;
	}
	public void setHamsandwich(int hamsandwich) {
		this.hamsandwich = hamsandwich;
	}
	public int getEggsandwich() {
		return eggsandwich;
	}
	public void setEggsandwich(int eggsandwich) {
		this.eggsandwich = eggsandwich;
	}
	public int getChoucream() {
		return choucream;
	}
	public void setChoucream(int choucream) {
		this.choucream = choucream;
	}
	public int getCheesetart() {
		return cheesetart;
	}
	public void setCheesetart(int cheesetart) {
		this.cheesetart = cheesetart;
	}
	public int getEggtart() {
		return eggtart;
	}
	public void setEggtart(int eggtart) {
		this.eggtart = eggtart;
	}
	public int getWalnuttart() {
		return walnuttart;
	}
	public void setWalnuttart(int walnuttart) {
		this.walnuttart = walnuttart;
	}
	public int getPlanemakaron() {
		return planemakaron;
	}
	public void setPlanemakaron(int planemakaron) {
		this.planemakaron = planemakaron;
	}
	public int getChocomakaron() {
		return chocomakaron;
	}
	public void setChocomakaron(int chocomakaron) {
		this.chocomakaron = chocomakaron;
	}
	public int getBerrymakaron() {
		return berrymakaron;
	}
	public void setBerrymakaron(int berrymakaron) {
		this.berrymakaron = berrymakaron;
	}
	public int getCheesemakaron() {
		return cheesemakaron;
	}
	public void setCheesemakaron(int cheesemakaron) {
		this.cheesemakaron = cheesemakaron;
	}
	public int getGreenmakaron() {
		return greenmakaron;
	}
	public void setGreenmakaron(int greenmakaron) {
		this.greenmakaron = greenmakaron;
	}
	public int getDacquoise() {
		return dacquoise;
	}
	public void setDacquoise(int dacquoise) {
		this.dacquoise = dacquoise;
	}
	public int getChocochip() {
		return chocochip;
	}
	public void setChocochip(int chocochip) {
		this.chocochip = chocochip;
	}
	public int getSabre() {
		return sabre;
	}
	public void setSabre(int sabre) {
		this.sabre = sabre;
	}
	public int getChocosabre() {
		return chocosabre;
	}
	public void setChocosabre(int chocosabre) {
		this.chocosabre = chocosabre;
	}
	public int getGingerbread() {
		return gingerbread;
	}
	public void setGingerbread(int gingerbread) {
		this.gingerbread = gingerbread;
	}
	public String getTel1() {
		return tel1;
	}
	public void setTel1(String tel1) {
		this.tel1 = tel1;
	}
	public String getTel2() {
		return tel2;
	}
	public void setTel2(String tel2) {
		this.tel2 = tel2;
	}
	public String getTel3() {
		return tel3;
	}
	public void setTel3(String tel3) {
		this.tel3 = tel3;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	
	
	
	



}
