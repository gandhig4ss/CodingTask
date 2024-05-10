import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.codingtask.data.GetArticles
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ArticlesViewModel(private val postRepository: ArticlesRepository) : ViewModel() {
    init {
        viewModelScope.launch(Dispatchers.IO) {
            postRepository.getArticles()

        }

    }

    val articles: LiveData<GetArticles>
        get() = postRepository.articles
}