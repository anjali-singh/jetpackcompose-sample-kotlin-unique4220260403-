package com.example.jetpackcompose_sample_kotlin.`15_pullToRefresh`

//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateListOf
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.rememberCoroutineScope
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.lazy.LazyColumn
//import androidx.compose.foundation.lazy.items
//import androidx.compose.material3.*
//import androidx.compose.runtime.*
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//
//
////means sometime when we want to refresh the page then we can use the pullToRefresh
//@Composable
//fun PullToRefreshExample() {
//    val scope = rememberCoroutineScope()
//    var isRefreshing by remember { mutableStateOf(false) }
//    val items = remember { mutableStateListOf<String>() }
//
//    // initial data
//    LaunchedEffect(Unit) {
//        items.clear()
//        items.addAll(List(20) { "Item $it" })
//    }
//
//    fun refreshItems() {
//        scope.launch {
//            isRefreshing = true
//            delay(2000) // simulate network call
//            items.clear()
//            items.addAll(List(20) { "Item ${ (0..100).random() }" })
//            isRefreshing = false
//        }
//    }
//
//    // Material3 has PullToRefresh via SwipeRefresh (Accompanist) or PullRefresh (Material3)
//    val pullRefreshState = rememberPullRefreshState(
//        refreshing = isRefreshing,
//        onRefresh = { refreshItems() }
//    )
//
//    Box(modifier = Modifier.fillMaxSize().pullRefresh(pullRefreshState)) {
//        LazyColumn(modifier = Modifier.fillMaxSize().padding(16.dp)) {
//            items(items) { item ->
//                Text(text = item, modifier = Modifier.padding(8.dp))
//            }
//        }
//        PullRefreshIndicator(
//            refreshing = isRefreshing,
//            state = pullRefreshState,
//            modifier = Modifier.align(Alignment.TopCenter)
//        )
//    }
//}
