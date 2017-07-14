package com.guoxiaoxing.eyepetizer.model.data

/**
 * For more information, you can visit https://github.com/guoxiaoxing or contact me by
 * guoxiaoxingse@163.com.
 *
 * @author guoxiaoxing
 * @since 2017/7/14 下午3:32
 */
data class Home(var nextPageUrl: String?,
                var nextPublishTime: Long,
                var newestIssueType: String?,
                var dialog: Any?,
                var issueList: List<IssueList>?) {

    data class IssueList(var releaseTime: Long,
                         var type: String?,
                         var date: Long,
                         var publishTime: Long,
                         var count: Int,
                         var itemList: List<ItemList>?) {

        data class ItemList(var type: String?,
                            var data: Data?,
                            var tag: Any?) {

            data class Data(var dataType: String?,
                            var id: Int,
                            var title: String?,
                            var description: String?,
                            var image: String?,
                            var actionUrl: String?,
                            var adTrack: Any?,
                            var isShade: Boolean,
                            var label: Any?,
                            var labelList: Any?,
                            var header: Any?,
                            var category: String?,
                            var duration: Long?,
                            var playUrl: String,
                            var cover: Cover?,
                            var author: Author?,
                            var releaseTime: Long?,
                            var consumption: Consumption?) {

                data class Cover(var feed: String?,
                                 var detail: String?,
                                 var blurred: String?,
                                 var sharing: String?,
                                 var homepage: String?)

                data class Consumption(var collectionCount: Int,
                                       var shareCount: Int,
                                       var replyCount: Int)


                data class Author(var icon: String)
            }
        }
    }
}
