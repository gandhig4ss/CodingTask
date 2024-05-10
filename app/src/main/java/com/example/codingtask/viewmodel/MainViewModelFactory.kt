import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.Factory

class MainViewModelFactory(private val repository: ArticlesRepository) : Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ArticlesViewModel(repository) as T
    }
}