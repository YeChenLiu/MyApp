package yel.com.myapp.net.response;

import java.util.List;

import yel.com.myapp.module.NewsModel;

/**
 * Created by xxb on 2017/1/17.
 */

public class NewsResponse {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"3a570937532343ca9263f08604b92ff3","title":"他被人排挤 是文弱的张国荣帮他撑腰","date":"2017-01-17 09:22","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170117092215942.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170117/20170117092215_87a751b77993385822e2696475a1bb27_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170117/20170117092215_87a751b77993385822e2696475a1bb27_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170117/20170117092215_87a751b77993385822e2696475a1bb27_3_mwpm_03200403.jpeg"},{"uniquekey":"c6b92b7bf6c8049a8e91c1f07371d954","title":"俄外交部发言人：美国曾试图策反俄外交官","date":"2017-01-17 09:24","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170117092428264.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170117/20170117092428_d42b7c54bd7cd91e03b55978150420ca_1_mwpm_03200403.jpeg"},{"uniquekey":"c8165c53b2cef0a3f890c0c4ca6621f7","title":"中纪委机关报刊文：民主生活会应触及灵魂","date":"2017-01-17 09:23","category":"头条","author_name":"中国纪检监察报","url":"http://mini.eastday.com/mobile/170117092349894.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170117/20170117092349_4ee616e31cc55798d67e0599c12ecf3b_1_mwpm_03200403.jpeg"},{"uniquekey":"32968074ef7627ad47b819c187fbfb97","title":"无视国际法院裁决 日本捕鲸船再现南极","date":"2017-01-17 09:20","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170117092032918.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117092032_fcbb40ce8e66014088312468cd7884be_1_mwpm_03200403.jpeg"},{"uniquekey":"c5902f24800d9ca0c7e9274692c8272e","title":"土耳其抓获伊斯坦布尔夜总会枪击案枪手，系乌兹别克斯坦人","date":"2017-01-17 09:14","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170117091422729.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117091422_ebf55c2888a1a48ddec9baa078178492_1_mwpm_03200403.jpeg"},{"uniquekey":"8af6ae6b8e4a1ec6007bdf39b40f2797","title":"\u201c常回家看看\u201d入法多年被指不中用","date":"2017-01-17 09:14","category":"头条","author_name":"法制日报","url":"http://mini.eastday.com/mobile/170117091422571.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170117/20170117091422_aa8b6fdda36bfc0380255c0878098d8c_1_mwpm_03200403.jpeg"},{"uniquekey":"c172d3eb5cf571191d0be072ee75ca74","title":"安倍在河内举行记者会称将争取尽早与特朗普会谈","date":"2017-01-17 09:14","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170117091406510.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117091406_c6e9f63efea962596d9850b2d10a7913_1_mwpm_03200403.jpeg"},{"uniquekey":"199a13bd06be41d931dce04740405b4c","title":"菲媒：12中国渔民去年在菲获判无罪 周五将被遣返","date":"2017-01-17 09:04","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170117090427971.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170117/20170117090427_9999c30f8b70d71b3d881651863d5a06_1_mwpm_03200403.jpeg"},{"uniquekey":"f6dcde2984738ed79fc6865250e8e830","title":"周冬雨获香港影评学会最佳女演员 称会保持初心","date":"2017-01-17 08:53","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170117085305235.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170117/20170117085305_5fe1491c80d64de9d6eaff81969bbf95_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170117/20170117085305_eb45992c2ad97133613c9bd97627f00c_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170117/20170117085305_c1104e62a47a1a99ba622ab2300c2a0f_3_mwpm_03200403.jpeg"},{"uniquekey":"733f28d20e0f0950538625567a69fcef","title":"16岁欧阳娜娜恋上34岁房祖名？傅娟驳斥：大家都疯了","date":"2017-01-17 08:48","category":"头条","author_name":"东森新闻云","url":"http://mini.eastday.com/mobile/170117084848608.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170117/20170117084848_dd57fdaa5f15e762e62028330aa4d955_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170117/20170117084848_dd57fdaa5f15e762e62028330aa4d955_2_mwpm_03200403.jpeg"},{"uniquekey":"9f2e29e8c5d02613cef4d7cd0f7c4e3b","title":"日本多地降暴雪致6人死300伤 引发交通系统混乱","date":"2017-01-17 08:46","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170117084623695.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117084623_0aeeac55cf0070d4cd768427cc09a360_1_mwpm_03200403.jpeg"},{"uniquekey":"b1b308743de27603e17f1acc3c3f9483","title":"中国首艘弹道导弹核潜艇生性\"懒惰\" 传闻已沉","date":"2017-01-17 08:45","category":"头条","author_name":"兵工厂","url":"http://mini.eastday.com/mobile/170117084511905.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170117/20170117084511_ac8301db3f51f0d18b87e4eeada34220_1_mwpm_03200403.jpeg"},{"uniquekey":"a33e38570727b97e30fbcb86ad058f90","title":"男子无意间挖出许多奇怪的石头，砸开后令他高兴不已！","date":"2017-01-17 08:43","category":"头条","author_name":"知鱼之乐小兵","url":"http://mini.eastday.com/mobile/170117084332358.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170117/20170117_40e71fad8f8d045acbfdcc960aa330b6_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170117/20170117_da9da77822ced81515a8993f68b18979_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170117/20170117_ac648803132e09adccfc625d5d8bdfce_cover_mwpm_03200403.jpeg"},{"uniquekey":"a96293247ce044c61ddb149c8f654c3b","title":"年底换机就选这10部：这颜值太想要","date":"2017-01-17 08:38","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170117083818401.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117083818_668229fd5e9af5d916e699783f8a29d7_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170117/20170117083818_668229fd5e9af5d916e699783f8a29d7_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170117/20170117083818_668229fd5e9af5d916e699783f8a29d7_3_mwpm_03200403.jpeg"},{"uniquekey":"ff8f44f65120ddd01fcd66729ad7f727","title":"土耳其货机坠毁已致37人死 疑因驾驶员失误引发","date":"2017-01-17 08:26","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170117082602935.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170117/20170117082602_45a2513e633c7735413a7e0bfea32d89_1_mwpm_03200403.jpeg"},{"uniquekey":"08822668dc645e57b711edf1cd887b5c","title":"伊斯坦布尔跨年枪击案嫌犯被捕 曾造成39人死亡","date":"2017-01-17 08:15","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170117081557449.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170117/20170117081557_371503d7ec1b72667a603297bcc6475d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170117/20170117081557_371503d7ec1b72667a603297bcc6475d_2_mwpm_03200403.jpeg"},{"uniquekey":"2432007606476b8045ccd3faf789c007","title":"《孤芳不自赏》钟汉良baby半裸热吻羞耻爆表","date":"2017-01-17 08:11","category":"头条","author_name":"凤凰网娱乐","url":"http://mini.eastday.com/mobile/170117081139026.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170117/20170117081139_1db301d19d188d3a8517f3eb081b416e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170117/20170117081139_1db301d19d188d3a8517f3eb081b416e_2_mwpm_03200403.jpeg"},{"uniquekey":"f852c1ba7083c10ad71eaa933d461d12","title":"土耳其夜总会袭击事件嫌犯落网","date":"2017-01-17 08:09","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170117080955942.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170117/20170117080955_529a9a2a946d594f05347481071e404f_1_mwpm_03200403.jpeg"},{"uniquekey":"c9b8eb13324246059c145b47b5b44de8","title":"医生：这三大野菜治疗女性\u201c妇科病\u201d！女人\u201c痛经\u201d也可以吃！","date":"2017-01-17 08:08","category":"头条","author_name":"烘焙斯霞","url":"http://mini.eastday.com/mobile/170117080850147.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117_9651dee2353e097b99f5b58f11631dd5_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170117/20170117_ba66bbd7b302cb3187321cb48ddb4375_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170117/20170117_0f9f10137d728998cdc23fc43571fb3c_cover_mwpm_03200403.jpeg"},{"uniquekey":"a21553b4ae65aebf06b36f39ec184a93","title":"患者突发躁狂 男医生一把将其抱进怀里","date":"2017-01-17 08:01","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170117080114044.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170117/20170117080114_0854a238403c121481f60a07c6866471_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170117/20170117080114_0854a238403c121481f60a07c6866471_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170117/20170117080114_0854a238403c121481f60a07c6866471_3_mwpm_03200403.jpeg"},{"uniquekey":"68c32c6a3ce3cbe441b95fd1e9acfd56","title":"云南一农行原行长受贿30万元潜逃12年 自首投案","date":"2017-01-17 08:00","category":"头条","author_name":"云南网","url":"http://mini.eastday.com/mobile/170117080024496.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170117/20170117080024_896c060f0ea88b01e8aff3fd140b651b_1_mwpm_03200403.jpeg"},{"uniquekey":"97a8cb969bcf46239d1d1779d0265845","title":"他在沙滩发现一只海龟，当看到它的后背整颗心都碎了","date":"2017-01-17 07:55","category":"头条","author_name":"带你看世界咯","url":"http://mini.eastday.com/mobile/170117075521017.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170117/20170117_46309b29081108fa0c56528e321786aa_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170117/20170117_a5449437ee4c137942733c17e9d533ce_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170117/20170117_54f47c9d7ee49478ae43e061bb10cc20_cover_mwpm_03200403.jpeg"},{"uniquekey":"e04c82a21446b11ba6100397374151cc","title":"陕西汉中：巴山深处的挂壁公路","date":"2017-01-17 07:55","category":"头条","author_name":"新蓝网·浙江网络广播电视台","url":"http://mini.eastday.com/mobile/170117075507040.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170117/20170117075507_b8f7baf5c65419ec8f3907f5c8bbcd39_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170117/20170117075507_b8f7baf5c65419ec8f3907f5c8bbcd39_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170117/20170117075507_b8f7baf5c65419ec8f3907f5c8bbcd39_3_mwpm_03200403.jpeg"},{"uniquekey":"5dbee0af3b468f0fdacc021d519b4c77","title":"与13岁男学生恋爱并怀孕美国女教师被判十年","date":"2017-01-17 07:49","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170117074927919.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117074927_b2bb40da180358c92b53467beac41018_1_mwpm_03200403.jpeg"},{"uniquekey":"9df08da54f636f9d34fb878d53dacd65","title":"俄罗斯失事图-154飞机遇难者葬礼在莫斯科举行","date":"2017-01-17 07:46","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170117074639314.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170117/20170117074639_aba43ab94bd52713f4884a2804888edc_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170117/20170117074639_d19cca874d393fafd2d1d3654078e24a_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170117/20170117074639_acfbcfa0859a7791681f36fc22f7822c_3_mwpm_03200403.jpeg"},{"uniquekey":"97c09ce31481c6b5d94a3107ab9ce3f7","title":"美民调：特朗普就职典礼前支持率破最低记录 不如三前辈","date":"2017-01-17 07:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170117074436080.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170117/20170117074436_0f6ccbd61330fb3e52a05b40daba3a65_1_mwpm_03200403.jpeg"},{"uniquekey":"7c2fdbc73a41e155da61c82903ae4a49","title":"日本要给菲律宾导弹遭拒 中国外交部：日方心态不健康","date":"2017-01-17 07:41","category":"头条","author_name":"新华国际","url":"http://mini.eastday.com/mobile/170117074108863.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117074108_47412df7dacbc5ed7998173f2aac817f_1_mwpm_03200403.jpeg"},{"uniquekey":"b0ee7ce40df887fb2febff35247ec877","title":"王老汉钓到淡水中昂贵的鱼，却把它当鲶鱼卖了","date":"2017-01-17 07:37","category":"头条","author_name":"追风少年","url":"http://mini.eastday.com/mobile/170117073717197.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117_1bd59d7bf330334e200f11af45736cd0_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170117/20170117_513c52be1504e55eddc098eb95521307_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170117/20170117_f27498ccc13810c7c8d632e172bf9846_cover_mwpm_03200403.png"},{"uniquekey":"5994ee7933513a612a5268e78ceacb3b","title":"网瘾电击疗法，终于有部法来管一管","date":"2017-01-17 07:36","category":"头条","author_name":"好奇心日报","url":"http://mini.eastday.com/mobile/170117073627243.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117073627_a9cf358de6fde021ff80a0d576175056_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170117/20170117073627_a9cf358de6fde021ff80a0d576175056_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170117/20170117073627_a9cf358de6fde021ff80a0d576175056_3_mwpm_03200403.jpeg"},{"uniquekey":"f4a0841ce90b8acbe414c00a58c2aaa0","title":"中国这款战机完爆法国幻影 巴铁高官激动的对中国说这样一句话","date":"2017-01-17 07:36","category":"头条","author_name":"墨者善狩","url":"http://mini.eastday.com/mobile/170117073605899.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170117/20170117073605_e88b8916e9aa8798ebf0e983d84de5ce_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170117/20170117073605_e88b8916e9aa8798ebf0e983d84de5ce_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170117/20170117073605_e88b8916e9aa8798ebf0e983d84de5ce_3_mwpm_03200403.jpeg"}]}
     * error_code : 0
     */

    private String reason;
    /**
     * stat : 1
     * data : [{"uniquekey":"3a570937532343ca9263f08604b92ff3","title":"他被人排挤 是文弱的张国荣帮他撑腰","date":"2017-01-17 09:22","category":"头条","author_name":"腾讯娱乐","url":"http://mini.eastday.com/mobile/170117092215942.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170117/20170117092215_87a751b77993385822e2696475a1bb27_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://04.imgmini.eastday.com/mobile/20170117/20170117092215_87a751b77993385822e2696475a1bb27_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://04.imgmini.eastday.com/mobile/20170117/20170117092215_87a751b77993385822e2696475a1bb27_3_mwpm_03200403.jpeg"},{"uniquekey":"c6b92b7bf6c8049a8e91c1f07371d954","title":"俄外交部发言人：美国曾试图策反俄外交官","date":"2017-01-17 09:24","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170117092428264.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170117/20170117092428_d42b7c54bd7cd91e03b55978150420ca_1_mwpm_03200403.jpeg"},{"uniquekey":"c8165c53b2cef0a3f890c0c4ca6621f7","title":"中纪委机关报刊文：民主生活会应触及灵魂","date":"2017-01-17 09:23","category":"头条","author_name":"中国纪检监察报","url":"http://mini.eastday.com/mobile/170117092349894.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170117/20170117092349_4ee616e31cc55798d67e0599c12ecf3b_1_mwpm_03200403.jpeg"},{"uniquekey":"32968074ef7627ad47b819c187fbfb97","title":"无视国际法院裁决 日本捕鲸船再现南极","date":"2017-01-17 09:20","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170117092032918.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117092032_fcbb40ce8e66014088312468cd7884be_1_mwpm_03200403.jpeg"},{"uniquekey":"c5902f24800d9ca0c7e9274692c8272e","title":"土耳其抓获伊斯坦布尔夜总会枪击案枪手，系乌兹别克斯坦人","date":"2017-01-17 09:14","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170117091422729.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117091422_ebf55c2888a1a48ddec9baa078178492_1_mwpm_03200403.jpeg"},{"uniquekey":"8af6ae6b8e4a1ec6007bdf39b40f2797","title":"\u201c常回家看看\u201d入法多年被指不中用","date":"2017-01-17 09:14","category":"头条","author_name":"法制日报","url":"http://mini.eastday.com/mobile/170117091422571.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170117/20170117091422_aa8b6fdda36bfc0380255c0878098d8c_1_mwpm_03200403.jpeg"},{"uniquekey":"c172d3eb5cf571191d0be072ee75ca74","title":"安倍在河内举行记者会称将争取尽早与特朗普会谈","date":"2017-01-17 09:14","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170117091406510.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117091406_c6e9f63efea962596d9850b2d10a7913_1_mwpm_03200403.jpeg"},{"uniquekey":"199a13bd06be41d931dce04740405b4c","title":"菲媒：12中国渔民去年在菲获判无罪 周五将被遣返","date":"2017-01-17 09:04","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170117090427971.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170117/20170117090427_9999c30f8b70d71b3d881651863d5a06_1_mwpm_03200403.jpeg"},{"uniquekey":"f6dcde2984738ed79fc6865250e8e830","title":"周冬雨获香港影评学会最佳女演员 称会保持初心","date":"2017-01-17 08:53","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170117085305235.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170117/20170117085305_5fe1491c80d64de9d6eaff81969bbf95_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170117/20170117085305_eb45992c2ad97133613c9bd97627f00c_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://06.imgmini.eastday.com/mobile/20170117/20170117085305_c1104e62a47a1a99ba622ab2300c2a0f_3_mwpm_03200403.jpeg"},{"uniquekey":"733f28d20e0f0950538625567a69fcef","title":"16岁欧阳娜娜恋上34岁房祖名？傅娟驳斥：大家都疯了","date":"2017-01-17 08:48","category":"头条","author_name":"东森新闻云","url":"http://mini.eastday.com/mobile/170117084848608.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170117/20170117084848_dd57fdaa5f15e762e62028330aa4d955_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170117/20170117084848_dd57fdaa5f15e762e62028330aa4d955_2_mwpm_03200403.jpeg"},{"uniquekey":"9f2e29e8c5d02613cef4d7cd0f7c4e3b","title":"日本多地降暴雪致6人死300伤 引发交通系统混乱","date":"2017-01-17 08:46","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170117084623695.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117084623_0aeeac55cf0070d4cd768427cc09a360_1_mwpm_03200403.jpeg"},{"uniquekey":"b1b308743de27603e17f1acc3c3f9483","title":"中国首艘弹道导弹核潜艇生性\"懒惰\" 传闻已沉","date":"2017-01-17 08:45","category":"头条","author_name":"兵工厂","url":"http://mini.eastday.com/mobile/170117084511905.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170117/20170117084511_ac8301db3f51f0d18b87e4eeada34220_1_mwpm_03200403.jpeg"},{"uniquekey":"a33e38570727b97e30fbcb86ad058f90","title":"男子无意间挖出许多奇怪的石头，砸开后令他高兴不已！","date":"2017-01-17 08:43","category":"头条","author_name":"知鱼之乐小兵","url":"http://mini.eastday.com/mobile/170117084332358.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170117/20170117_40e71fad8f8d045acbfdcc960aa330b6_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170117/20170117_da9da77822ced81515a8993f68b18979_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170117/20170117_ac648803132e09adccfc625d5d8bdfce_cover_mwpm_03200403.jpeg"},{"uniquekey":"a96293247ce044c61ddb149c8f654c3b","title":"年底换机就选这10部：这颜值太想要","date":"2017-01-17 08:38","category":"头条","author_name":"凤凰网","url":"http://mini.eastday.com/mobile/170117083818401.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117083818_668229fd5e9af5d916e699783f8a29d7_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170117/20170117083818_668229fd5e9af5d916e699783f8a29d7_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170117/20170117083818_668229fd5e9af5d916e699783f8a29d7_3_mwpm_03200403.jpeg"},{"uniquekey":"ff8f44f65120ddd01fcd66729ad7f727","title":"土耳其货机坠毁已致37人死 疑因驾驶员失误引发","date":"2017-01-17 08:26","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170117082602935.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170117/20170117082602_45a2513e633c7735413a7e0bfea32d89_1_mwpm_03200403.jpeg"},{"uniquekey":"08822668dc645e57b711edf1cd887b5c","title":"伊斯坦布尔跨年枪击案嫌犯被捕 曾造成39人死亡","date":"2017-01-17 08:15","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170117081557449.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170117/20170117081557_371503d7ec1b72667a603297bcc6475d_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170117/20170117081557_371503d7ec1b72667a603297bcc6475d_2_mwpm_03200403.jpeg"},{"uniquekey":"2432007606476b8045ccd3faf789c007","title":"《孤芳不自赏》钟汉良baby半裸热吻羞耻爆表","date":"2017-01-17 08:11","category":"头条","author_name":"凤凰网娱乐","url":"http://mini.eastday.com/mobile/170117081139026.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170117/20170117081139_1db301d19d188d3a8517f3eb081b416e_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://05.imgmini.eastday.com/mobile/20170117/20170117081139_1db301d19d188d3a8517f3eb081b416e_2_mwpm_03200403.jpeg"},{"uniquekey":"f852c1ba7083c10ad71eaa933d461d12","title":"土耳其夜总会袭击事件嫌犯落网","date":"2017-01-17 08:09","category":"头条","author_name":"中国日报网","url":"http://mini.eastday.com/mobile/170117080955942.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170117/20170117080955_529a9a2a946d594f05347481071e404f_1_mwpm_03200403.jpeg"},{"uniquekey":"c9b8eb13324246059c145b47b5b44de8","title":"医生：这三大野菜治疗女性\u201c妇科病\u201d！女人\u201c痛经\u201d也可以吃！","date":"2017-01-17 08:08","category":"头条","author_name":"烘焙斯霞","url":"http://mini.eastday.com/mobile/170117080850147.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117_9651dee2353e097b99f5b58f11631dd5_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170117/20170117_ba66bbd7b302cb3187321cb48ddb4375_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170117/20170117_0f9f10137d728998cdc23fc43571fb3c_cover_mwpm_03200403.jpeg"},{"uniquekey":"a21553b4ae65aebf06b36f39ec184a93","title":"患者突发躁狂 男医生一把将其抱进怀里","date":"2017-01-17 08:01","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170117080114044.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170117/20170117080114_0854a238403c121481f60a07c6866471_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170117/20170117080114_0854a238403c121481f60a07c6866471_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170117/20170117080114_0854a238403c121481f60a07c6866471_3_mwpm_03200403.jpeg"},{"uniquekey":"68c32c6a3ce3cbe441b95fd1e9acfd56","title":"云南一农行原行长受贿30万元潜逃12年 自首投案","date":"2017-01-17 08:00","category":"头条","author_name":"云南网","url":"http://mini.eastday.com/mobile/170117080024496.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170117/20170117080024_896c060f0ea88b01e8aff3fd140b651b_1_mwpm_03200403.jpeg"},{"uniquekey":"97a8cb969bcf46239d1d1779d0265845","title":"他在沙滩发现一只海龟，当看到它的后背整颗心都碎了","date":"2017-01-17 07:55","category":"头条","author_name":"带你看世界咯","url":"http://mini.eastday.com/mobile/170117075521017.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170117/20170117_46309b29081108fa0c56528e321786aa_cover_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170117/20170117_a5449437ee4c137942733c17e9d533ce_cover_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170117/20170117_54f47c9d7ee49478ae43e061bb10cc20_cover_mwpm_03200403.jpeg"},{"uniquekey":"e04c82a21446b11ba6100397374151cc","title":"陕西汉中：巴山深处的挂壁公路","date":"2017-01-17 07:55","category":"头条","author_name":"新蓝网·浙江网络广播电视台","url":"http://mini.eastday.com/mobile/170117075507040.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170117/20170117075507_b8f7baf5c65419ec8f3907f5c8bbcd39_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170117/20170117075507_b8f7baf5c65419ec8f3907f5c8bbcd39_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170117/20170117075507_b8f7baf5c65419ec8f3907f5c8bbcd39_3_mwpm_03200403.jpeg"},{"uniquekey":"5dbee0af3b468f0fdacc021d519b4c77","title":"与13岁男学生恋爱并怀孕美国女教师被判十年","date":"2017-01-17 07:49","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170117074927919.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117074927_b2bb40da180358c92b53467beac41018_1_mwpm_03200403.jpeg"},{"uniquekey":"9df08da54f636f9d34fb878d53dacd65","title":"俄罗斯失事图-154飞机遇难者葬礼在莫斯科举行","date":"2017-01-17 07:46","category":"头条","author_name":"新华社","url":"http://mini.eastday.com/mobile/170117074639314.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170117/20170117074639_aba43ab94bd52713f4884a2804888edc_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170117/20170117074639_d19cca874d393fafd2d1d3654078e24a_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170117/20170117074639_acfbcfa0859a7791681f36fc22f7822c_3_mwpm_03200403.jpeg"},{"uniquekey":"97c09ce31481c6b5d94a3107ab9ce3f7","title":"美民调：特朗普就职典礼前支持率破最低记录 不如三前辈","date":"2017-01-17 07:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170117074436080.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170117/20170117074436_0f6ccbd61330fb3e52a05b40daba3a65_1_mwpm_03200403.jpeg"},{"uniquekey":"7c2fdbc73a41e155da61c82903ae4a49","title":"日本要给菲律宾导弹遭拒 中国外交部：日方心态不健康","date":"2017-01-17 07:41","category":"头条","author_name":"新华国际","url":"http://mini.eastday.com/mobile/170117074108863.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117074108_47412df7dacbc5ed7998173f2aac817f_1_mwpm_03200403.jpeg"},{"uniquekey":"b0ee7ce40df887fb2febff35247ec877","title":"王老汉钓到淡水中昂贵的鱼，却把它当鲶鱼卖了","date":"2017-01-17 07:37","category":"头条","author_name":"追风少年","url":"http://mini.eastday.com/mobile/170117073717197.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170117/20170117_1bd59d7bf330334e200f11af45736cd0_cover_mwpm_03200403.png","thumbnail_pic_s02":"http://03.imgmini.eastday.com/mobile/20170117/20170117_513c52be1504e55eddc098eb95521307_cover_mwpm_03200403.png","thumbnail_pic_s03":"http://03.imgmini.eastday.com/mobile/20170117/20170117_f27498ccc13810c7c8d632e172bf9846_cover_mwpm_03200403.png"},{"uniquekey":"5994ee7933513a612a5268e78ceacb3b","title":"网瘾电击疗法，终于有部法来管一管","date":"2017-01-17 07:36","category":"头条","author_name":"好奇心日报","url":"http://mini.eastday.com/mobile/170117073627243.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170117/20170117073627_a9cf358de6fde021ff80a0d576175056_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://09.imgmini.eastday.com/mobile/20170117/20170117073627_a9cf358de6fde021ff80a0d576175056_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://09.imgmini.eastday.com/mobile/20170117/20170117073627_a9cf358de6fde021ff80a0d576175056_3_mwpm_03200403.jpeg"},{"uniquekey":"f4a0841ce90b8acbe414c00a58c2aaa0","title":"中国这款战机完爆法国幻影 巴铁高官激动的对中国说这样一句话","date":"2017-01-17 07:36","category":"头条","author_name":"墨者善狩","url":"http://mini.eastday.com/mobile/170117073605899.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170117/20170117073605_e88b8916e9aa8798ebf0e983d84de5ce_1_mwpm_03200403.jpeg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170117/20170117073605_e88b8916e9aa8798ebf0e983d84de5ce_2_mwpm_03200403.jpeg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170117/20170117073605_e88b8916e9aa8798ebf0e983d84de5ce_3_mwpm_03200403.jpeg"}]
     */

    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        private String stat;
        /**
         * uniquekey : 3a570937532343ca9263f08604b92ff3
         * title : 他被人排挤 是文弱的张国荣帮他撑腰
         * date : 2017-01-17 09:22
         * category : 头条
         * author_name : 腾讯娱乐
         * url : http://mini.eastday.com/mobile/170117092215942.html
         * thumbnail_pic_s : http://04.imgmini.eastday.com/mobile/20170117/20170117092215_87a751b77993385822e2696475a1bb27_1_mwpm_03200403.jpeg
         * thumbnail_pic_s02 : http://04.imgmini.eastday.com/mobile/20170117/20170117092215_87a751b77993385822e2696475a1bb27_2_mwpm_03200403.jpeg
         * thumbnail_pic_s03 : http://04.imgmini.eastday.com/mobile/20170117/20170117092215_87a751b77993385822e2696475a1bb27_3_mwpm_03200403.jpeg
         */

        private List<NewsModel> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<NewsModel> getData() {
            return data;
        }

        public void setData(List<NewsModel> data) {
            this.data = data;
        }
    }
}