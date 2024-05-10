import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.codingtask.data.GetArticles
import com.example.codingtask.databinding.RowItemBinding

class ArticlesAdapter(private val getArticles: GetArticles) :
    RecyclerView.Adapter<ArticlesAdapter.MainViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val binding = RowItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return MainViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return getArticles.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        with(holder) {
            with(getArticles[position]) {
                binding.title.text = this.title
                binding.content.text = this.description
            }
        }

    }

    inner class MainViewHolder(val binding: RowItemBinding) : RecyclerView.ViewHolder(binding.root)

}