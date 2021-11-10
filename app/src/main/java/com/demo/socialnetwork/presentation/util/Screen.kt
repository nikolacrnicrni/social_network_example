package com.demo.socialnetwork.presentation.util

sealed class Screen(val route: String){
    object SplashScreen: Screen("splash_screen")
    object LoginScreen: Screen("login_screen")
    object RegisterScreen: Screen("register_screen")
    object MainFeedScreen: Screen("main_feed__screen")
    object PostDetailScreen: Screen("post_detail_screen")
    object ChatScreen: Screen("chat_screen")
    object MessagesSceen: Screen("messages_screen")
    object ProfileSceen: Screen("profile_screen")
    object EditProfileSceen: Screen("edit_profile_screen")
    object PersonListScreenSceen: Screen("person_list_screen")
    object CreatePostSceen: Screen("create_post_screen")
    object ActivitySceen: Screen("activity_screen")
    object SearchSceen: Screen("search_screen")
}
