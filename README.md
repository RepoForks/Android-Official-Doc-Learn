
# Android Official Docs Learn

``Android``开发的一些代码示例，来自[官方Training文档](https://developer.android.com/training/index.html)的实现以及一些探索性实验。

测试环境：``Android Studio 2.1``，``API 14-23``

### Demo List
 1. [My First App](https://github.com/sennhviwang/Android-Learn-Journey#my-first-app)
 - [Android LifeCycle Demo](https://github.com/sennhviwang/Android-Learn-Journey#android-lifecycle-demo)
 - [Fragment Basic Learn](https://github.com/sennhviwang/Android-Learn-Journey#fragment-basic-learn)
 - [SQLite OpenHelper Demo(High)](https://github.com/sennhviwang/Android-Learn-Journey#sqlite-openhelper-demo)
 - [An Interactive Intent Demo](https://github.com/sennhviwang/Android-Learn-Journey#an-interactive-intent-demo)
 - [A Permission Demo](https://github.com/sennhviwang/Android-Learn-Journey#a-permission-demo)
 - [A Content Sharing Demo](https://github.com/sennhviwang/Android-Learn-Journey#a-content-sharing-demo)
 - [Animation List Demo](https://github.com/sennhviwang/Android-Learn-Journey#animation-list-demo)
 - [Android Nanohttpd Super Big File Upload Server](https://github.com/sennhviwang/Android-Learn-Journey#android-nanohttpd-super-big-file-upload-server)
 

###### [My First App](https://github.com/sennhviwang/Android-Learn-Journey/tree/master/MyFirstApp)
 - ``Intent``示例，启动另一个``activity``并在其中显示之前输入的文本
 - ``Key Words``: Intent, onClick, putExtra, startActivity, parentActivityName, getIntent.
 - [Starting Another Activity](https://developer.android.com/training/basics/firstapp/starting-activity.html)


###### [Android LifeCycle Demo](https://github.com/sennhviwang/Android-Learn-Journey/tree/master/AndroidLifeCycleDemo)
 - 简单的生命周期示例，需要使用``DDMS``来查看日志
 - ``Key Words``: onCreate, onStart, onResume, onRestart, onPause, onStop, onDestory, onSaveInstanceState, onRestoreInstanceState.
 - [Managing the Activity Lifecycle](https://developer.android.com/training/basics/activity-lifecycle/starting.html)


###### [Fragment Basic Learn](https://github.com/sennhviwang/Android-Learn-Journey/tree/master/FragmentBasicLearn)
 - ``Fragment``基础示例，使用``Fragment``显示标题和正文
 - ``Key Words``: Fragment, FrameLayout, FragmentTransaction, getSupportFragmentManager, addToBackStack.
 - [Building a Dynamic UI with Fragments](https://developer.android.com/training/basics/fragments/index.html)


###### [SQLite OpenHelper Demo](https://github.com/sennhviwang/Android-Learn-Journey/tree/master/SQLiteOpenHelperDemo)
 - 使用``SQLite``数据库的``SQLiteOpenHelper``示例，不包括使用``Preferences``和``Files``，说明``Dao``，``Bean``，``DBHelper``较好的例子
 - ``Key Words``: BaseColumns, SQLiteOpenHelper, ContentValues, moveToFirst, getColumnIndex, getReadableDatabase, getWritableDatabase, setEnabled.
 - [Saving Data in SQL Databases](https://developer.android.com/training/basics/data-storage/databases.html)


###### [An Interactive Intent Demo](https://github.com/sennhviwang/Android-Learn-Journey/tree/master/AnInteractiveIntentDemo)
 - 使用``Intent``与应用交互：拨号
 - ``Key Words``: Intent, ACTION_DIAL, packageManager, startActivityForResult, RESULT_OK, RESULT_CANCELLED, intent-filter, Uri, setResult.
 - [Interacting with Other Apps](https://developer.android.com/training/basics/intents/index.html)


###### [A Permission Demo](https://github.com/sennhviwang/Android-Learn-Journey/tree/master/APermissionDemo)
 - 系统权限使用示例，由于``Android 6.0``要求，需在运行时请求权限，部分参考官方文档代码
 - ``Key Words``: uses-permission, checkSelfPermission, shouldShowRequestPermissionRationale, RequestPermissions, onRequestPermissionsResult.
 - [Working with System Permissions](https://developer.android.com/training/permissions/index.html)


###### [A Content Sharing Demo](https://github.com/sennhviwang/Android-Learn-Journey/tree/master/AContentSharingDemo)
 - 内容分享示例，在读写存储空间时有必要在运行时声明和请求系统权限，功能包括输入和分享文本，设置压缩图片结果并支持分享，通过调用浏览器查询``IP``地址位置，学习更多关于``Intent``内容如``intent-filter``,``action``,``category``,``data:scheme``,``mimeType``等，同时也是使用``Android Studio``分渠道打包示例
 - ``Key Words``: uses-permission, checkSelfPermission, shouldShowRequestPermissionRationale, RequestPermissions, onRequestPermissionsResult, getPickImageIntent, getImageResized, decodeBitmap, getRotationFromGallery, getRotationFromCamera, startActivityForResult, requestCode, resultCode, onBackPressed, setData, putExtra, addCategory, finish
 - [Apps with Content Sharing](https://developer.android.com/training/building-content-sharing.html)


##### [Animation List Demo](https://github.com/sennhviwang/Android-Learn-Journey/tree/master/AnimationListDemo)
 - 帧动画示例,顺序,倒序,停止动画demo
 - ``Key Words``: AnimationDrawable, getDrawable, setImageResource, animation-list, android:oneshot
 - [Animation List-CSDN](http://blog.csdn.net/aminfo/article/details/7847761)

##### [[Android Nanohttpd Super Big File Upload Server](https://github.com/sennhviwang/Android-Learn-Journey/tree/master/AndroidNanohttpdSuperBigFileUploadServer)
 - 支持局域网超大文件上传的Nanohttpd,可置于android,需模拟multipart/form-data上传文件,应用部分太多,不列举.
 - ``Key Words``: Nanohttpd, upload, json, wifimanager...
 - [Nanohttpd](https://github.com/NanoHttpd/nanohttpd)


---

###### License: MIT license (MIT)