package com.example.codingtask.ui

import ArticlesAdapter
import ArticlesRepository
import ArticlesViewModel
import MainViewModelFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.codingtask.R
import com.example.codingtask.api.ApiClient
import com.example.codingtask.api.ApiInterface
import com.example.codingtask.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainViewModel: ArticlesViewModel
    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var articlesAdapter: ArticlesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        activityMainBinding.recyclerview.layoutManager = LinearLayoutManager(this)


        val apiInterface = ApiClient.getPostsClient().create(ApiInterface::class.java)
        val repository = ArticlesRepository(apiInterface)
        mainViewModel =
            ViewModelProvider(this, MainViewModelFactory(repository)).get(ArticlesViewModel::class.java)
        mainViewModel.articles.observe(this, Observer {

            articlesAdapter = ArticlesAdapter( it)
            activityMainBinding.recyclerview.adapter = articlesAdapter
        })

    }
}