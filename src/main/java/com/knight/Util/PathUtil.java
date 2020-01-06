package com.knight.Util;

/**
 * Created by forget on 2019/12/28.
 */
public class PathUtil {
    //必选参数 : phone: 手机号码 password: 密码
    public static String mobileLogin="/login/cellphone";
    //必选参数 : email: 163 网易邮箱 password: 密码
    public static String emailLogin="/login";
    //必选参数 : phone: 手机号码
    public static String refreshLogin="/login/refresh";
    //必选参数 : phone: 手机号码 captcha: 验证码
    public static String verificationCode="/captcha/verify";

    public static String sendCode="/captcha/sent";

    public static String logout="/logout";
    //必选参数 : uid : 用户 id
    public static String userDetail="/user/detail";
    //必选参数 : uid : 用户 id
    public static String userPlaylist="/user/playlist";
    //可选参数 : limit: 取出评论数量 , 默认为 20 offset: 偏移数量
    public static String hotTopic="/hot/topic";
    //必选参数 : cat : 即 category Code,歌手类型,默认 1001,返回华语男歌手数据 可选参数 : limit : 返回数量 , 默认为 30 offset : 偏移数量
    public static String singerTypeList="/artist/list";
    //必选参数 : id : 歌手 id
    public static String top50Song="/artist/top/song";
    //调用此接口,可获取歌单分类,包含 category 信息
    public static String playListType="/playlist/catlist";
    //调用此接口 , 可获取网友精选碟歌单 order: 可选值为 'new' 和 'hot', 分别对应最新和最热 , 默认为 'hot' cat:cat: tag, 比如 " 华语 " 可从歌单分类接口获取(/playlist/catlist)
    public static String hotPlayList="/top/playlist";
    //必选参数 : id : 歌单 id
    public static String playListDetail="/playlist/detail";
    //必选参数 : id : 音乐 id 可选参数 : br: 码率,默认设置了 999000 即最大码率,如果要 320k 则可设置为 320000,其他类推
    public static String songUrl="/song/url";
    //必选参数 : keywords : 关键词 可选参数 : limit : 返回数量 , 默认为 30 offset : 偏移数量 type: 搜索类型
    public static String search="/search";
    //调用此接口,可获取热门搜索列表
    public static String hotSearch="/search/hot";
    //必选参数 : id: 音乐 id
    public static String lyric="/lyric";
    //必选参数 : id: 音乐 id 可选参数 : limit: 取出评论数量 , 默认为 20 offset: 偏移数量  before: 分页参数,
    public static String musicComment="/comment/music";
    //必选参数 : id: 歌单 id 可选参数 : limit: 取出评论数量 , 默认为 20 offset: 偏移数量 , 用于分页 , 如 :( 评论页数 -1)*20, 其中 20 为 limit 的值 before: 分页参数,取上一页最后一项的 time 获取下一页数据(获取超过5000条评论的时候需要用到)
    public static String playlistComment="/comment/playlist";
    //必选参数 : ids: 音乐 id, 如 ids=347230
    public static String songDetail="/song/detail";
    //必选参数 : id: 专辑 id
    public static String album="/album";
    //调用此接口 , 传入歌手 id, 可获得歌手部分信息和热门歌曲 必选参数 : id: 歌手 id, 可由搜索接口获得
    public static String singer="/artists";
    //必选参数 : id: 歌手 id  可选参数 : limit: 取出数量 , 默认为 50 offset: 偏移数量
    public static String singerAlbum="/artist/album";
    //调用此接口 , 传入歌手 id, 可获得歌手描述  必选参数 : id: 歌手 id
    public static String singerDesc="/artist/desc";
    //调用此接口 , 可获得每日推荐歌单 ( 需要登录 )
    public static String recommendPlayList="/recommend/resource";
    //调用此接口 , 可获得每日推荐歌曲 ( 需要登录 )
    public static String recommendSongs="/recommend/songs";
    //调用此接口 ，获取云音乐首页新碟上架数据
    public static String newestAlbum="/album/newest";
    //调用此接口 , 可获取热门歌手数据 limit: 取出数量 , 默认为 50 offset: 偏移数量 , 用于分页
    public static String topSinger="/top/artists";
    //调用此接口 , 传入数字 idx, 可获取不同排行榜
    public static String topList="/top/list";
    //调用此接口 , 可获取排行榜中的歌手榜
    public static String singerTopList="/toplist/artist";
}
