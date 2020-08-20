package tw.com.ehanlin;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.logging.Logger;

public class LibraryTest {
    public static Logger logger = Logger.getLogger(LibraryTest.class.getName());
    public static MongoClient CLIENT;

    @BeforeAll
    public static void CREATE_DB() {
        CLIENT = MongoClients.create(
                MongoClientSettings.builder()
                        .applyConnectionString(new ConnectionString("mongodb://mongo"))
                        .build());
    }

    @BeforeEach
    public void setupDB() {
        logger.info("setupDB start");
        CLIENT.getDatabase("ehanlin").getCollection("items").insertMany(Arrays.asList(
                Document.parse("{\n" +
                        "\t\"_id\" : \"y105_g7_s1_pc_et\",\n" +
                        "\t\"edition\" : NumberInt(1),\n" +
                        "\t\"description\" : {\n" +
                        "\t\t\"course\" : \"e名師\",\n" +
                        "\t\t\"expire\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"text\" : \"使用期限\",\n" +
                        "\t\t\t\t\"value\" : \"+1y\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"feature\" : null,\n" +
                        "\t\t\"gift\" : null,\n" +
                        "\t\t\"grade\" : \"國一上\",\n" +
                        "\t\t\"handout\" : null,\n" +
                        "\t\t\"handoutAmount\" : null,\n" +
                        "\t\t\"handoutPreview\" : true,\n" +
                        "\t\t\"hd\" : \"預估47小時HD高畫質棚錄教學影片，適用108上學期各版本\",\n" +
                        "\t\t\"include\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"02.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"補教界國學殿堂柳吟國文團隊親自授課\",\n" +
                        "\t\t\t\t\t\"HD高畫質教學影片，包含形音義、文意篇旨、修辭辨析…，重點整理詳細\",\n" +
                        "\t\t\t\t\t\"完全掌握學習進度，重要例題解說詳細，講課內容精闢紮實，隨點隨看反覆學習\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"教學影片：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"03.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"獨家講義內容完美搭配線上影音教學\",\n" +
                        "\t\t\t\t\t\"依教育部課綱，國中古文/白話文全收錄\",\n" +
                        "\t\t\t\t\t\"條列式/表格化的重點整理，方便課前預習/考前複習\",\n" +
                        "\t\t\t\t\t\"分析歷屆考情，補充各種國學常識\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"精華講義：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"04.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"全國最大線上國文題庫，精選足量練習題目\",\n" +
                        "\t\t\t\t\t\"題題解析清楚詳盡，提供形音義訣竅幫助記憶\",\n" +
                        "\t\t\t\t\t\"題目年年更新，隨時隨地方便測驗練習\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"「國文科」雲端題庫：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"05.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"搭配教學影片的測驗卷，主要測驗基礎概念\",\n" +
                        "\t\t\t\t\t\"於觀看後立即驗收學習成效，奠定基礎觀念\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"隨堂測驗：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"06.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"搭配學校小考進度的測驗卷，難度較隨堂測驗稍高\",\n" +
                        "\t\t\t\t\t\"可於適當學習段落進行複習，或在學校小考前練習\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"名師派卷：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"07.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"海量題庫提供妳反覆練習，徹底熟練每個單元\",\n" +
                        "\t\t\t\t\t\"累積升級，明確看見自己在每個單元的等級\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"e評量：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"08.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"自動整理課程內完成的每份測驗錯題，方便考前快速複習\",\n" +
                        "\t\t\t\t\t\"可自行勾選重點題目，創造個人獨一無二重點題庫\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"個人題庫：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"09.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"所有測驗交卷後自動批閱，提供個人弱點分析\",\n" +
                        "\t\t\t\t\t\"一目了然自己的弱點，馬上根據補救建議觀看影音課程或再次練習\",\n" +
                        "\t\t\t\t\t\"完整紀錄成績，對照全國答對率+群體平均，提供完整學力分析\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"診斷補救：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"12.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"每學期定期舉辦，比照會考等級\",\n" +
                        "\t\t\t\t\t\"名師依據會考分級標準，精選必考題型\",\n" +
                        "\t\t\t\t\t\"考試科目：國、英、數、自、社\",\n" +
                        "\t\t\t\t\t\"含英聽，不含作文與非選題\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"線上模考：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"10.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"對於自我評量題目有不懂的地方，可以發出線上解題救援\",\n" +
                        "\t\t\t\t\t\"雲端學院老師將會1-3個工作天內以文字回覆為您詳加說明，快速擊破弱點\",\n" +
                        "\t\t\t\t\t\"針對不懂的盲點提出，線上老師會針對提問問題為你解題\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"解題救援：\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"image\" : \"16.png\",\n" +
                        "\t\t\t\t\"list\" : [\n" +
                        "\t\t\t\t\t\"snapask解題團隊，真人老師24小時在線服務，60秒超速配對讓你馬上解決問題\",\n" +
                        "\t\t\t\t\t\"對於自我評量、名師派卷題目有疑問想釐清，可以發出線上即時救援，線上老師立刻配對進行1對1輔導\",\n" +
                        "\t\t\t\t\t\"針對輔導的內容還是有不理解的地方，可以立刻進一步向老師詢問直到完全了解為止，加強觀念釐清\",\n" +
                        "\t\t\t\t\t\"提供多裝置的發問方式，不只在雲端學院遇到的問題，學校的大考、小考或複習時在參考書遇到的盲點，都能隨時發問，沒有什麼是今天學不會的！\"\n" +
                        "\t\t\t\t],\n" +
                        "\t\t\t\t\"title\" : \"即時救援(推薦加購)：\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"main\" : \"\",\n" +
                        "\t\t\"sort\" : \"et\",\n" +
                        "\t\t\"subject\" : \"國文\",\n" +
                        "\t\t\"suitableYear\" : null,\n" +
                        "\t\t\"table\" : null,\n" +
                        "\t\t\"teachers\" : \"<a href='/products/type/jhs/id/pc_liuyin/Teachers.html'>柳吟國文團隊(柳吟、陳甘霖老師)</a>\",\n" +
                        "\t\t\"tip\" : \"<span style='color:#FF0088;'>★全國唯一符合108課程新課綱線上學習課程</span><br>\\n★此產品包含國一上&nbsp;國文e評量<br>\",\n" +
                        "\t\t\"video\" : [\n" +
                        "\t\t\t\"y2fZUecr-AI\"\n" +
                        "\t\t],\n" +
                        "\t\t\"videoAmount\" : null,\n" +
                        "\t\t\"videoImage\" : null,\n" +
                        "\t\t\"writingImage\" : null,\n" +
                        "\t\t\"year\" : \"105\"\n" +
                        "\t},\n" +
                        "\t\"image\" : \"y105_g7_s1_pc_et.png\",\n" +
                        "\t\"name\" : \"國一上 國文．柳吟國文\",\n" +
                        "\t\"showcase\" : {\n" +
                        "\t\t\"ad\" : {\n" +
                        "\t\t\t\"link\" : \"https://www.ehanlin.com.tw/products/type/ONLINE/category/%E3%80%90e%E5%90%8D%E5%B8%AB%E3%80%91%E9%AB%98%E4%B8%AD%E5%AD%B8%E6%B8%AC%E7%B8%BD%E8%A4%87%E7%BF%92%E5%84%AA%E6%83%A0%E7%B5%84%E5%90%88/SalesPlans.html\",\n" +
                        "\t\t\t\"img_height\" : 100,\n" +
                        "\t\t\t\"note\" : null,\n" +
                        "\t\t\t\"img\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course/activity-1.gif?ts=magic20200423\",\n" +
                        "\t\t\t\"_id\" : \"會考衝刺優惠卷\",\n" +
                        "\t\t\t\"img_width\" : 200\n" +
                        "\t\t},\n" +
                        "\t\t\"help\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"note\" : \"國文攻略一\",\n" +
                        "\t\t\t\t\"description\" : \"<p>提供翰林、康軒、南一課本完整文言文、精華白話文內容加上自學選文引導教學。選擇學校就能自動為您帶入校用版本好輕鬆!</p>\",\n" +
                        "\t\t\t\t\"img\" : null,\n" +
                        "\t\t\t\t\"_id\" : \"閱讀UP\",\n" +
                        "\t\t\t\t\"video\" : null,\n" +
                        "\t\t\t\t\"title\" : \"<p>各版文章不缺漏，閱讀實力UP</p>\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"note\" : \"國文攻略二\",\n" +
                        "\t\t\t\t\"description\" : \"<p>為你補充各課字形字音、成語、國學常識等統整資料，基本分數顧牢好安心!</p>\",\n" +
                        "\t\t\t\t\"img\" : null,\n" +
                        "\t\t\t\t\"_id\" : \"最清晰\",\n" +
                        "\t\t\t\t\"video\" : null,\n" +
                        "\t\t\t\t\"title\" : \"<p>培養超強國學力，統整比較最清晰</p>\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"image\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course_icon/g7_s2_pc_et.png\",\n" +
                        "\t\t\"importantMessages\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"message\" : \"<p>為提供您更好的學習品質，各版本內容將於以下時間更新：<br /><span style=\\\"color: #ff6600;\\\">名師影音教學：【二段】3月初；【三段】4月初、康軒版自我評量：2月底、南一版自我評量：【一段】2月底；【二段】4月中。</span><br />於更新前您仍可使用舊年度課程內容。</p>\",\n" +
                        "\t\t\t\t\"note\" : \"國中全產品分段上線公告\",\n" +
                        "\t\t\t\t\"_id\" : \"國中分段上\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"message\" : \"<p>本次預購講義將分為2次寄送，【第二部份】將於3月初出貨。</p>\",\n" +
                        "\t\t\t\t\"note\" : \"國中全產品講義2次出貨公告\",\n" +
                        "\t\t\t\t\"_id\" : \"國中講議2次出\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"problem\" : {\n" +
                        "\t\t\t\"note\" : \"國中一年級國文用\",\n" +
                        "\t\t\t\"imgs\" : [\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"文章好長\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_好長\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5e8d7a689be2b500069afe0e.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t},\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"文言文頭暈\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_好暈\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5e00706bbcd4160006df232f.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t},\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"同音同義好多\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_好多\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5e8d86019be2b500069afe0f.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t},\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"沒看過文章陣亡\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_陣亡\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5d0a08968c566500094ed9e4.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t}\n" +
                        "\t\t\t],\n" +
                        "\t\t\t\"_id\" : \"國一柳吟\",\n" +
                        "\t\t\t\"epilog\" : \"<p>沒錯!很多同學都會遇到這些問題但卻毫無準備辦法及方向<br/>根據#{team}及翰林雲端學院多年教學經驗，我們有更好的方法讓你不再困擾!</p>\",\n" +
                        "\t\t\t\"title\" : \"<p>剛升國中，是否有遇到這些問題?</p>\"\n" +
                        "\t\t},\n" +
                        "\t\t\"tip\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"img_height\" : 250,\n" +
                        "\t\t\t\t\"note\" : null,\n" +
                        "\t\t\t\t\"img\" : \"https://d1jme9zqkbqig.cloudfront.net/5e8d7a689be2b500069afe0e.png\",\n" +
                        "\t\t\t\t\"link\" : null,\n" +
                        "\t\t\t\t\"description\" : \"<p>不限時間地點，不用複雜的裝備，只要能上網的地方都是你學習的好地方!利用零碎的時間做基本練習、學習；考前完整複習，還有更多時間可以培養興趣!</p>\",\n" +
                        "\t\t\t\t\"_id\" : \"全年無休\",\n" +
                        "\t\t\t\t\"img_width\" : 300,\n" +
                        "\t\t\t\t\"title\" : \"<p>全年為你開放，學習彈性自由</p>\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"img_height\" : 250,\n" +
                        "\t\t\t\t\"note\" : null,\n" +
                        "\t\t\t\t\"img\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/teacher_info_photo/jhs/pc_a.png\",\n" +
                        "\t\t\t\t\"link\" : \"https://www.ehanlin.com.tw/products/type/jhs/id/pc_liuyin/Teachers.html\",\n" +
                        "\t\t\t\t\"description\" : \"<p>別再看補習班糢糊不清的補帶了!#{team}憑借多年教學經驗，從1,000位學生的歷程中焠煉出精華重點，再統整為全新教材，依照知識概念拍攝各版本共#{video_num}支教學影片，時間短、易吸收，更容易知道盲點!除此之外，影片內容依照課綱調整各年更新，即使只有微幅的更動也不放過，就是要給同學們最新最符合課本的教學內容!</p>\",\n" +
                        "\t\t\t\t\"_id\" : \"時數統計\",\n" +
                        "\t\t\t\t\"img_width\" : 300,\n" +
                        "\t\t\t\t\"title\" : \"<p>名師親拍!#{total_hr}小時HD高畫質棚錄教學影片</p>\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"video\" : \"ebcYBhhucLI\",\n" +
                        "        \"handout_cover\" : [\"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course/handout/preview/y105_g7_s2_pc_et_0.jpg\"],\n" +
                        "        \"handout_url\" : [\"https://ies.ed.gov/ncee/wwc/Docs/InterventionReports/wwc_pm_icanlearn_082917.pdf\"],\n" +
                        "        \"handout\" : [{\n" +
                        "            cover : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course/handout/preview/y105_g7_s2_pc_et_0.jpg\",\n" +
                        "            url : \"https://ies.ed.gov/ncee/wwc/Docs/InterventionReports/wwc_pm_icanlearn_082917.pdf\"\n" +
                        "        }],\n" +
                        "        \"recommend\" : [\"y105_g7_s1_pc_et\"],\n" +
                        "        \"teachTeam\" : [\"j_liuyin\"],\n" +
                        "        \"teacher\" : [\"pc_liuyin\",\"pc_zoutongyi\"],\n" +
                        "        \"total_hr\" : \"3000\",\n" +
                        "        \"video_num\" : \"900\",\n" +
                        "        \"story\" : [\"y105_g7_s1_pc_et\"]\n" +
                        "\t},\n" +
                        "\t\"sort\" : \"et\",\n" +
                        "\t\"products\" : [\n" +
                        "\t\t{\n" +
                        "\t\t\t\"id\" : \"y105_g7_s1_pc_et\",\n" +
                        "\t\t\t\"expire\" : \"+1y\",\n" +
                        "\t\t\t\"extensible\" : true,\n" +
                        "\t\t\t\"checkConflict\" : true\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"id\" : \"y105_g7_s1_pc_ep\",\n" +
                        "\t\t\t\"expire\" : \"+1y\",\n" +
                        "\t\t\t\"extensible\" : true,\n" +
                        "\t\t\t\"checkConflict\" : false\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"id\" : \"y108_g7_s1_all_mocks\",\n" +
                        "\t\t\t\"expire\" : \"2023/07/31\",\n" +
                        "\t\t\t\"extensible\" : true,\n" +
                        "\t\t\t\"checkConflict\" : false\n" +
                        "\t\t}\n" +
                        "\t],\n" +
                        "\t\"category\" : [\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"y105_jhs_s1_1280_et_key\",\n" +
                        "\t\t\t\"group\" : \"國中一年級系列\",\n" +
                        "\t\t\t\"order\" : 1\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"king_of_eHanlin_y105_s1\",\n" +
                        "\t\t\t\"group\" : \"國一e名師\",\n" +
                        "\t\t\t\"order\" : 28\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"y105_jhs_s2_1280_et_key\",\n" +
                        "\t\t\t\"group\" : \"國中一年級系列\",\n" +
                        "\t\t\t\"order\" : 1\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"y106_jhs_s1_1280_et_key\",\n" +
                        "\t\t\t\"group\" : \"國中一年級系列\",\n" +
                        "\t\t\t\"order\" : 1\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"y106_courses_1280_key\",\n" +
                        "\t\t\t\"group\" : \"國中一年級系列\",\n" +
                        "\t\t\t\"order\" : 1\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"y106_jhs_s2_1280_et_key\",\n" +
                        "\t\t\t\"group\" : \"國中一年級系列\",\n" +
                        "\t\t\t\"order\" : 2\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"y107_jhs_s1_1880_et_key\",\n" +
                        "\t\t\t\"group\" : \"國中一年級系列\",\n" +
                        "\t\t\t\"order\" : 0\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"y107_courses_1880_key\",\n" +
                        "\t\t\t\"group\" : \"國中一年級系列\",\n" +
                        "\t\t\t\"order\" : 0\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"5cfde6f64c18f9000926fdd4\",\n" +
                        "\t\t\t\"group\" : \"國中一年級系列\",\n" +
                        "\t\t\t\"order\" : 0\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"5d6c7a984df6a5000aa78989\",\n" +
                        "\t\t\t\"group\" : \"國一上e名師系列\",\n" +
                        "\t\t\t\"order\" : 0\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"5cbdb6964c18f9000926e809\",\n" +
                        "\t\t\t\"group\" : \"國中一年級系列\",\n" +
                        "\t\t\t\"order\" : 0\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"5dd26e8012a4400009dddf42\",\n" +
                        "\t\t\t\"group\" : \"國一e名師\",\n" +
                        "\t\t\t\"order\" : 2\n" +
                        "\t\t},\n" +
                        "\t\t{\n" +
                        "\t\t\t\"name\" : \"y105_g7_s1_pc_et\",\n" +
                        "\t\t\t\"group\" : \"國一e名師系列\",\n" +
                        "\t\t\t\"order\" : 0\n" +
                        "\t\t}\n" +
                        "\t]\n" +
                        "}"),
                Document.parse("{\n" +
                        "    \"_id\" : \"y104_g10_s1_en_hansheng_et\",\n" +
                        "    \"image\" : \"g10_s1_en_hansheng_et.png\",\n" +
                        "    \"description\" : {\n" +
                        "        \"expire\" : [ \n" +
                        "            {\n" +
                        "                \"text\" : \"使用期限\",\n" +
                        "                \"value\" : \"+1y\",\n" +
                        "                \"product\" : \"y104_g10_s1_en_hansheng_et\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"includeImage\" : null,\n" +
                        "        \"year\" : \"104\",\n" +
                        "        \"course\" : \"e名師\",\n" +
                        "        \"include\" : [ \n" +
                        "            {\n" +
                        "                \"image\" : \"02.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"名師補習班實境錄影教學影片\", \n" +
                        "                    \"依照精編講義進度，逐項詳細解說\", \n" +
                        "                    \"課內必教，補充克漏字字彙\", \n" +
                        "                    \"搭配名師精編講義，隨點隨看學習\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"精彩影音：\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"image\" : \"03.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"名師親自編撰，網羅各版本精華\", \n" +
                        "                    \"內容完全對應影片授課進度\", \n" +
                        "                    \"克漏字片語寫作通通有 \", \n" +
                        "                    \"先修重點齊備，複習省時又方便\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"精華講義：\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"image\" : \"05.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"自選範圍檢測，快速分析，主動對應知識點\", \n" +
                        "                    \"對照全學院群體平均，了解個人實力\", \n" +
                        "                    \"解析完整詳盡，一看馬上學會，複習事半功倍\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"智慧診斷：\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"image\" : \"06.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"提供英聽卷練習\", \n" +
                        "                    \"精選英聽代表性試題，最佳練習工具\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"英聽卷練習：\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"image\" : \"07.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"錯題自動匯集至錯題庫，亦可手動勾選題目\", \n" +
                        "                    \"考前直接複習個人題庫，省時省力有效率\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"個人專屬題庫：\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"grade\" : \"高一\",\n" +
                        "        \"main\" : \"高中英文最強名師「吳翰陞」老師線上公開教學<br>\\n教學經驗豐富，上課輕鬆活潑、教學淺顯易懂<br>\\n獨創的記憶法學習，有效增強聽、說、讀、寫各方面單字片語學習<br>\\n共39小時77堂資優英文精華影音教學，適用於綜合版本<br>\\n講義每一例題及重點，全部都有影片對應解說<br>\\n影音可跳播，隨點隨看反覆學習<br>\\n(含：教學影片+獨家5本名師精華講義 +診斷補救)\",\n" +
                        "        \"video\" : \"www.youtube.com/embed/4HfoxN_PUhs\",\n" +
                        "        \"sort\" : \"et\",\n" +
                        "        \"tip\" : \"教學影片:補習班實境錄影<br>\\n因版權問題，無法販售至台南/高雄使用\",\n" +
                        "        \"subject\" : \"翰陞英文資優班(一)\",\n" +
                        "        \"feature\" : [ \n" +
                        "            \"高中補教界最強英文「翰陞英文團隊」，102-104學測英文15級分高達 650人！\", \n" +
                        "            \"最完整的資優英文影音課程搭配多元化教材，真正學以致用，輕鬆銜接高一英文\", \n" +
                        "            \"收錄高中先修必備片語、句型，重點掌握大考出題\", \n" +
                        "            \"字彙寶典補充，實戰練習增進閱讀文章能力\", \n" +
                        "            \"資優寫作連翻式翻譯，輕鬆掌握寫作的技巧\", \n" +
                        "            \"克漏字題組練習，掌握重點學習，克漏單字輕鬆記\", \n" +
                        "            \"影片全依講義內容逐項解說，文法觀念深入淺出，一聽就懂\", \n" +
                        "            \"精選聽力測驗，題題輔以時事，加強你的聽力反應力\", \n" +
                        "            \"課後讓你成功「動口動手、眼到心到」，學習的成就感，征服高一英文\"\n" +
                        "        ],\n" +
                        "        \"handoutPreview\" : true\n" +
                        "    },\n" +
                        "    \"showcase\" : {\n" +
                        "\t\t\"ad\" : {\n" +
                        "\t\t\t\"link\" : \"https://www.ehanlin.com.tw/products/type/ONLINE/category/%E3%80%90e%E5%90%8D%E5%B8%AB%E3%80%91%E9%AB%98%E4%B8%AD%E5%AD%B8%E6%B8%AC%E7%B8%BD%E8%A4%87%E7%BF%92%E5%84%AA%E6%83%A0%E7%B5%84%E5%90%88/SalesPlans.html\",\n" +
                        "\t\t\t\"img_height\" : 100,\n" +
                        "\t\t\t\"note\" : null,\n" +
                        "\t\t\t\"img\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course/activity-1.gif?ts=magic20200423\",\n" +
                        "\t\t\t\"_id\" : \"會考衝刺優惠卷\",\n" +
                        "\t\t\t\"img_width\" : 200\n" +
                        "\t\t},\n" +
                        "\t\t\"help\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"note\" : \"國文攻略一\",\n" +
                        "\t\t\t\t\"description\" : \"<p>提供翰林、康軒、南一課本完整文言文、精華白話文內容加上自學選文引導教學。選擇學校就能自動為您帶入校用版本好輕鬆!</p>\",\n" +
                        "\t\t\t\t\"img\" : null,\n" +
                        "\t\t\t\t\"_id\" : \"閱讀UP\",\n" +
                        "\t\t\t\t\"video\" : null,\n" +
                        "\t\t\t\t\"title\" : \"<p>各版文章不缺漏，閱讀實力UP</p>\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"note\" : \"國文攻略二\",\n" +
                        "\t\t\t\t\"description\" : \"<p>為你補充各課字形字音、成語、國學常識等統整資料，基本分數顧牢好安心!</p>\",\n" +
                        "\t\t\t\t\"img\" : null,\n" +
                        "\t\t\t\t\"_id\" : \"最清晰\",\n" +
                        "\t\t\t\t\"video\" : null,\n" +
                        "\t\t\t\t\"title\" : \"<p>培養超強國學力，統整比較最清晰</p>\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"image\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course_icon/g7_s2_pc_et.png\",\n" +
                        "\t\t\"importantMessages\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"message\" : \"<p>為提供您更好的學習品質，各版本內容將於以下時間更新：<br /><span style=\\\"color: #ff6600;\\\">名師影音教學：【二段】3月初；【三段】4月初、康軒版自我評量：2月底、南一版自我評量：【一段】2月底；【二段】4月中。</span><br />於更新前您仍可使用舊年度課程內容。</p>\",\n" +
                        "\t\t\t\t\"note\" : \"國中全產品分段上線公告\",\n" +
                        "\t\t\t\t\"_id\" : \"國中分段上\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"message\" : \"<p>本次預購講義將分為2次寄送，【第二部份】將於3月初出貨。</p>\",\n" +
                        "\t\t\t\t\"note\" : \"國中全產品講義2次出貨公告\",\n" +
                        "\t\t\t\t\"_id\" : \"國中講議2次出\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"problem\" : {\n" +
                        "\t\t\t\"note\" : \"國中一年級國文用\",\n" +
                        "\t\t\t\"imgs\" : [\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"文章好長\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_好長\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5e8d7a689be2b500069afe0e.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t},\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"文言文頭暈\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_好暈\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5e00706bbcd4160006df232f.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t},\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"同音同義好多\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_好多\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5e8d86019be2b500069afe0f.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t},\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"沒看過文章陣亡\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_陣亡\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5d0a08968c566500094ed9e4.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t}\n" +
                        "\t\t\t],\n" +
                        "\t\t\t\"_id\" : \"國一柳吟\",\n" +
                        "\t\t\t\"epilog\" : \"<p>沒錯!很多同學都會遇到這些問題但卻毫無準備辦法及方向<br/>根據#{team}及翰林雲端學院多年教學經驗，我們有更好的方法讓你不再困擾!</p>\",\n" +
                        "\t\t\t\"title\" : \"<p>剛升國中，是否有遇到這些問題?</p>\"\n" +
                        "\t\t},\n" +
                        "\t\t\"tip\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"img_height\" : 250,\n" +
                        "\t\t\t\t\"note\" : null,\n" +
                        "\t\t\t\t\"img\" : \"https://d1jme9zqkbqig.cloudfront.net/5e8d7a689be2b500069afe0e.png\",\n" +
                        "\t\t\t\t\"link\" : null,\n" +
                        "\t\t\t\t\"description\" : \"<p>不限時間地點，不用複雜的裝備，只要能上網的地方都是你學習的好地方!利用零碎的時間做基本練習、學習；考前完整複習，還有更多時間可以培養興趣!</p>\",\n" +
                        "\t\t\t\t\"_id\" : \"全年無休\",\n" +
                        "\t\t\t\t\"img_width\" : 300,\n" +
                        "\t\t\t\t\"title\" : \"<p>全年為你開放，學習彈性自由</p>\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"img_height\" : 250,\n" +
                        "\t\t\t\t\"note\" : null,\n" +
                        "\t\t\t\t\"img\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/teacher_info_photo/jhs/pc_a.png\",\n" +
                        "\t\t\t\t\"link\" : \"https://www.ehanlin.com.tw/products/type/jhs/id/pc_liuyin/Teachers.html\",\n" +
                        "\t\t\t\t\"description\" : \"<p>別再看補習班糢糊不清的補帶了!#{team}憑借多年教學經驗，從1,000位學生的歷程中焠煉出精華重點，再統整為全新教材，依照知識概念拍攝各版本共#{video_num}支教學影片，時間短、易吸收，更容易知道盲點!除此之外，影片內容依照課綱調整各年更新，即使只有微幅的更動也不放過，就是要給同學們最新最符合課本的教學內容!</p>\",\n" +
                        "\t\t\t\t\"_id\" : \"時數統計\",\n" +
                        "\t\t\t\t\"img_width\" : 300,\n" +
                        "\t\t\t\t\"title\" : \"<p>名師親拍!#{total_hr}小時HD高畫質棚錄教學影片</p>\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"video\" : \"ebcYBhhucLI\",\n" +
                        "        \"handout_cover\" : [\"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course/handout/preview/y105_g7_s2_pc_et_0.jpg\"],\n" +
                        "        \"handout_url\" : [\"https://ies.ed.gov/ncee/wwc/Docs/InterventionReports/wwc_pm_icanlearn_082917.pdf\"],\n" +
                        "        \"handout\" : [{\n" +
                        "            cover : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course/handout/preview/y105_g7_s2_pc_et_0.jpg\",\n" +
                        "            url : \"https://ies.ed.gov/ncee/wwc/Docs/InterventionReports/wwc_pm_icanlearn_082917.pdf\"\n" +
                        "        }],\n" +
                        "        \"recommend\" : [\"y105_g7_s1_pc_et\"],\n" +
                        "        \"teachTeam\" : [\"j_liuyin\"],\n" +
                        "        \"teacher\" : [\"pc_liuyin\"],\n" +
                        "        \"total_hr\" : \"3000\",\n" +
                        "        \"video_num\" : \"900\"\n" +
                        "\t},\n" +
                        "    \"sort\" : \"et\",\n" +
                        "    \"products\" : [ \n" +
                        "        {\n" +
                        "            \"checkConflict\" : true,\n" +
                        "            \"expire\" : \"+1y\",\n" +
                        "            \"id\" : \"y104_g10_s1_en_hansheng_et\"\n" +
                        "        }, \n" +
                        "        {\n" +
                        "            \"checkConflict\" : false,\n" +
                        "            \"expire\" : \"-\",\n" +
                        "            \"id\" : \"y104_g10_s1_en_hansheng_handout\"\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"name\" : \"高一翰陞英文資優班(一)\",\n" +
                        "    \"category\" : [ \n" +
                        "        {\n" +
                        "            \"name\" : \"king_of_eHanlin_y104_s1\",\n" +
                        "            \"group\" : \"高中一年級系列\",\n" +
                        "            \"order\" : 54.0\n" +
                        "        }\n" +
                        "    ]\n" +
                        "}"),
                Document.parse("{\n" +
                        "    \"_id\" : \"y104_g10_s1_ma_fue_et\",\n" +
                        "    \"image\" : \"g10_s1_ma_fue_et.png\",\n" +
                        "    \"description\" : {\n" +
                        "        \"expire\" : [ \n" +
                        "            {\n" +
                        "                \"text\" : \"使用期限\",\n" +
                        "                \"value\" : \"+1y\",\n" +
                        "                \"product\" : \"y104_g10_s1_ma_fue_et\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"text\" : \"(附)e評量使用期限\",\n" +
                        "                \"value\" : \"2019/07/31\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"includeImage\" : null,\n" +
                        "        \"year\" : \"104\",\n" +
                        "        \"course\" : \"e名師\",\n" +
                        "        \"include\" : [ \n" +
                        "            {\n" +
                        "                \"image\" : \"02.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"名師團隊親自錄製HD高畫質教學影片\", \n" +
                        "                    \"全國唯一完全依照講義進度，逐題詳細解說\", \n" +
                        "                    \"觀念教學清楚易懂，示範解題一學就會\", \n" +
                        "                    \"搭配講義，隨點隨看反覆學習\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"精彩影音：\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"image\" : \"03.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"名師親自統整各版本重點精華\", \n" +
                        "                    \"包含觀念細說+精選範例+考前衝刺題\", \n" +
                        "                    \"講義內容完全配合線上影音教學進度\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"精華講義：\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"image\" : \"04.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"網羅歷屆重點題、考題改編、名師資優挑戰題\", \n" +
                        "                    \"海量題目不斷更新，跨越城鄉資訊落差\", \n" +
                        "                    \"可隨時隨地反覆練習重點題目\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"「數學科」雲端題庫：\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"image\" : \"05.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"自選範圍，交卷快速批閱，抓出弱點立即補救\", \n" +
                        "                    \"解析完整詳盡，一看馬上學會，複習事半功倍\", \n" +
                        "                    \"提供學院平均，精準分析個人戰鬥力\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"智慧診斷：\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"image\" : \"06.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"提供多份大範圍複習卷，可多次練習\", \n" +
                        "                    \"名師精選試題，題題具代表性，考前最佳演練\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"名師派卷：\"\n" +
                        "            }, \n" +
                        "            {\n" +
                        "                \"image\" : \"07.png\",\n" +
                        "                \"list\" : [ \n" +
                        "                    \"系統自動整理數學錯題庫，方便再次練習\", \n" +
                        "                    \"可隨時手動勾選題目，自創高分重點題庫\"\n" +
                        "                ],\n" +
                        "                \"title\" : \"個人專屬題庫：\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"grade\" : \"高一\",\n" +
                        "        \"main\" : \"高中數學最強名師「傅壹」線上公開教學<br>\\n逾30年教學經驗，上課認真親切、淺顯易懂<br>\\n搭配精編講義，共37小時178堂影音教學，各版本適用<br>\\n講義每一例題及重點，全部都有影片對應解說<br>\\n影音可跳播，隨點隨看反覆學習<br>\\n(含：教學影片+獨家講義+線上題庫+診斷補救)\",\n" +
                        "        \"video\" : \"www.youtube.com/embed/Rya-f3_q6sw\",\n" +
                        "        \"sort\" : \"et\",\n" +
                        "        \"tip\" : null,\n" +
                        "        \"subject\" : \"傅壹數學(一)\",\n" +
                        "        \"feature\" : [ \n" +
                        "            \"高中補教界最強數學「傅壹團隊」，台大醫/法/財/電科系學生傲視全國\", \n" +
                        "            \"依教育部課綱，最完整的綜合版數學影音課程，包含：基礎概念講解、精選例題示範、考題解析\", \n" +
                        "            \"各小節加碼資優挑戰延伸題型、歷屆學測指考題分析\", \n" +
                        "            \"每章另有考前重點整理、考前衝刺大解密、考前叮嚀\", \n" +
                        "            \"影片全依講義內容逐項解說，重要觀念深入淺出，一聽就懂\", \n" +
                        "            \"精選足量練習題目，題題皆搭配解析影片，看會為止\", \n" +
                        "            \"課後可利用「數學e評量」個人線上測評，真正活化學習，輕鬆掌握考前複習方向\", \n" +
                        "            \"享受數學滿分的成就感，讓你征服高中數學！\"\n" +
                        "        ],\n" +
                        "        \"handoutPreview\" : true\n" +
                        "    },\n" +
                        "    \"showcase\" : {\n" +
                        "\t\t\"ad\" : {\n" +
                        "\t\t\t\"link\" : \"https://www.ehanlin.com.tw/products/type/ONLINE/category/%E3%80%90e%E5%90%8D%E5%B8%AB%E3%80%91%E9%AB%98%E4%B8%AD%E5%AD%B8%E6%B8%AC%E7%B8%BD%E8%A4%87%E7%BF%92%E5%84%AA%E6%83%A0%E7%B5%84%E5%90%88/SalesPlans.html\",\n" +
                        "\t\t\t\"img_height\" : 100,\n" +
                        "\t\t\t\"note\" : null,\n" +
                        "\t\t\t\"img\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course/activity-1.gif?ts=magic20200423\",\n" +
                        "\t\t\t\"_id\" : \"會考衝刺優惠卷\",\n" +
                        "\t\t\t\"img_width\" : 200\n" +
                        "\t\t},\n" +
                        "\t\t\"help\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"note\" : \"國文攻略一\",\n" +
                        "\t\t\t\t\"description\" : \"<p>提供翰林、康軒、南一課本完整文言文、精華白話文內容加上自學選文引導教學。選擇學校就能自動為您帶入校用版本好輕鬆!</p>\",\n" +
                        "\t\t\t\t\"img\" : null,\n" +
                        "\t\t\t\t\"_id\" : \"閱讀UP\",\n" +
                        "\t\t\t\t\"video\" : null,\n" +
                        "\t\t\t\t\"title\" : \"<p>各版文章不缺漏，閱讀實力UP</p>\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"note\" : \"國文攻略二\",\n" +
                        "\t\t\t\t\"description\" : \"<p>為你補充各課字形字音、成語、國學常識等統整資料，基本分數顧牢好安心!</p>\",\n" +
                        "\t\t\t\t\"img\" : null,\n" +
                        "\t\t\t\t\"_id\" : \"最清晰\",\n" +
                        "\t\t\t\t\"video\" : null,\n" +
                        "\t\t\t\t\"title\" : \"<p>培養超強國學力，統整比較最清晰</p>\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"image\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course_icon/g7_s2_pc_et.png\",\n" +
                        "\t\t\"importantMessages\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"message\" : \"<p>為提供您更好的學習品質，各版本內容將於以下時間更新：<br /><span style=\\\"color: #ff6600;\\\">名師影音教學：【二段】3月初；【三段】4月初、康軒版自我評量：2月底、南一版自我評量：【一段】2月底；【二段】4月中。</span><br />於更新前您仍可使用舊年度課程內容。</p>\",\n" +
                        "\t\t\t\t\"note\" : \"國中全產品分段上線公告\",\n" +
                        "\t\t\t\t\"_id\" : \"國中分段上\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"message\" : \"<p>本次預購講義將分為2次寄送，【第二部份】將於3月初出貨。</p>\",\n" +
                        "\t\t\t\t\"note\" : \"國中全產品講義2次出貨公告\",\n" +
                        "\t\t\t\t\"_id\" : \"國中講議2次出\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"problem\" : {\n" +
                        "\t\t\t\"note\" : \"國中一年級國文用\",\n" +
                        "\t\t\t\"imgs\" : [\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"文章好長\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_好長\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5e8d7a689be2b500069afe0e.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t},\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"文言文頭暈\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_好暈\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5e00706bbcd4160006df232f.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t},\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"同音同義好多\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_好多\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5e8d86019be2b500069afe0f.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t},\n" +
                        "\t\t\t\t{\n" +
                        "\t\t\t\t\t\"width\" : 500,\n" +
                        "\t\t\t\t\t\"note\" : \"沒看過文章陣亡\",\n" +
                        "\t\t\t\t\t\"_id\" : \"國文問題圖_陣亡\",\n" +
                        "\t\t\t\t\t\"src\" : \"https://d1jme9zqkbqig.cloudfront.net/5d0a08968c566500094ed9e4.png\",\n" +
                        "\t\t\t\t\t\"height\" : 260\n" +
                        "\t\t\t\t}\n" +
                        "\t\t\t],\n" +
                        "\t\t\t\"_id\" : \"國一柳吟\",\n" +
                        "\t\t\t\"epilog\" : \"<p>沒錯!很多同學都會遇到這些問題但卻毫無準備辦法及方向<br/>根據#{team}及翰林雲端學院多年教學經驗，我們有更好的方法讓你不再困擾!</p>\",\n" +
                        "\t\t\t\"title\" : \"<p>剛升國中，是否有遇到這些問題?</p>\"\n" +
                        "\t\t},\n" +
                        "\t\t\"tip\" : [\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"img_height\" : 250,\n" +
                        "\t\t\t\t\"note\" : null,\n" +
                        "\t\t\t\t\"img\" : \"https://d1jme9zqkbqig.cloudfront.net/5e8d7a689be2b500069afe0e.png\",\n" +
                        "\t\t\t\t\"link\" : null,\n" +
                        "\t\t\t\t\"description\" : \"<p>不限時間地點，不用複雜的裝備，只要能上網的地方都是你學習的好地方!利用零碎的時間做基本練習、學習；考前完整複習，還有更多時間可以培養興趣!</p>\",\n" +
                        "\t\t\t\t\"_id\" : \"全年無休\",\n" +
                        "\t\t\t\t\"img_width\" : 300,\n" +
                        "\t\t\t\t\"title\" : \"<p>全年為你開放，學習彈性自由</p>\"\n" +
                        "\t\t\t},\n" +
                        "\t\t\t{\n" +
                        "\t\t\t\t\"img_height\" : 250,\n" +
                        "\t\t\t\t\"note\" : null,\n" +
                        "\t\t\t\t\"img\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/teacher_info_photo/jhs/pc_a.png\",\n" +
                        "\t\t\t\t\"link\" : \"https://www.ehanlin.com.tw/products/type/jhs/id/pc_liuyin/Teachers.html\",\n" +
                        "\t\t\t\t\"description\" : \"<p>別再看補習班糢糊不清的補帶了!#{team}憑借多年教學經驗，從1,000位學生的歷程中焠煉出精華重點，再統整為全新教材，依照知識概念拍攝各版本共#{video_num}支教學影片，時間短、易吸收，更容易知道盲點!除此之外，影片內容依照課綱調整各年更新，即使只有微幅的更動也不放過，就是要給同學們最新最符合課本的教學內容!</p>\",\n" +
                        "\t\t\t\t\"_id\" : \"時數統計\",\n" +
                        "\t\t\t\t\"img_width\" : 300,\n" +
                        "\t\t\t\t\"title\" : \"<p>名師親拍!#{total_hr}小時HD高畫質棚錄教學影片</p>\"\n" +
                        "\t\t\t}\n" +
                        "\t\t],\n" +
                        "\t\t\"video\" : \"ebcYBhhucLI\",\n" +
                        "        \"handout_cover\" : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course/handout/preview/y105_g7_s2_pc_et_0.jpg\",\n" +
                        "        \"handout_url\" : \"https://ies.ed.gov/ncee/wwc/Docs/InterventionReports/wwc_pm_icanlearn_082917.pdf\",\n" +
                        "        \"handout\" : [{\n" +
                        "            cover : \"https://s3-ap-northeast-1.amazonaws.com/ehanlin-web-resource/platform/1.0.0/resource/imgs/course/handout/preview/y105_g7_s2_pc_et_0.jpg\",\n" +
                        "            url : \"https://ies.ed.gov/ncee/wwc/Docs/InterventionReports/wwc_pm_icanlearn_082917.pdf\"\n" +
                        "        }],\n" +
                        "        \"recommend\" : [\"y105_g7_s1_pc_et\"],\n" +
                        "        \"teachTeam\" : [\"j_liuyin\"],\n" +
                        "        \"teacher\" : [\"pc_zoutongyi\"],\n" +
                        "        \"total_hr\" : \"3000\",\n" +
                        "        \"video_num\" : \"900\"\n" +
                        "\t},\n" +
                        "    \"sort\" : \"et\",\n" +
                        "    \"products\" : [ \n" +
                        "        {\n" +
                        "            \"checkConflict\" : true,\n" +
                        "            \"expire\" : \"+1y\",\n" +
                        "            \"id\" : \"y104_g10_s1_ma_fue_et\"\n" +
                        "        }, \n" +
                        "        {\n" +
                        "            \"checkConflict\" : false,\n" +
                        "            \"expire\" : \"-\",\n" +
                        "            \"id\" : \"y104_g10_s1_ma_fue_handout\"\n" +
                        "        }, \n" +
                        "        {\n" +
                        "            \"checkConflict\" : false,\n" +
                        "            \"expire\" : \"2018/07/31\",\n" +
                        "            \"id\" : \"y104_g10_s1_ma_ep\"\n" +
                        "        }\n" +
                        "    ],\n" +
                        "    \"name\" : \"高一傅壹數學(一)\",\n" +
                        "    \"category\" : [ \n" +
                        "        {\n" +
                        "            \"name\" : \"king_of_eHanlin_y104_s1\",\n" +
                        "            \"group\" : \"高中一年級系列\",\n" +
                        "            \"order\" : 58.0\n" +
                        "        }, \n" +
                        "        {\n" +
                        "            \"name\" : \"y104_hs_s1_2980_et_key\",\n" +
                        "            \"group\" : \"高中一年級系列\",\n" +
                        "            \"order\" : 1.0\n" +
                        "        }, \n" +
                        "        {\n" +
                        "            \"name\" : \"y104_hs_s2_2980_et_key\",\n" +
                        "            \"group\" : \"高中一年級系列\",\n" +
                        "            \"order\" : 3.0\n" +
                        "        }\n" +
                        "    ]\n" +
                        "}")
        ));
        logger.info("setupDB end");
    }

    @AfterEach
    public void cleanDB() {
        logger.info("cleanDB start");
        CLIENT.getDatabase("ehanlin").drop();
        logger.info("cleanDB end");
    }

    @RepeatedTest(10000)
    @Test
    public void testLibrary() {
        Library lib = new Library(CLIENT);
        Document doc = lib.findOne("y104_g10_s1_en_hansheng_et");
        Assertions.assertEquals("y104_g10_s1_en_hansheng_et", doc.getString("_id"));
    }
}
