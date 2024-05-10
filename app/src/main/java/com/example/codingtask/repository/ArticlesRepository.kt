import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.codingtask.api.ApiInterface
import com.example.codingtask.data.GetArticles

class ArticlesRepository(private val apiInterface: ApiInterface) {

    private val postsLiveData = MutableLiveData<GetArticles>()

    val articles: LiveData<GetArticles>
        get() = postsLiveData

    suspend fun getArticles() {
        val result = apiInterface.getArticlesapi()
        if (result.body() != null) {
            postsLiveData.postValue(result.body())
        }

    }
}