package com.santiago.examplemvvm.data

import com.santiago.examplemvvm.data.model.QuoteModel
import com.santiago.examplemvvm.data.model.QuoteProvider
import com.santiago.examplemvvm.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel>{
        val response:List<QuoteModel> = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}