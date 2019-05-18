package com.example.myapplication
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.SearchView
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import kotlinx.android.synthetic.main.activity_recycle.*

class RecycleActivity : AppCompatActivity() {
    var array :ArrayList<recyalemodel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle)

        var obl = sqlite(this, null, null, 1)
        obl.addProduct(1997, "nisargbaba", 302)

        var model = recyalemodel()
        model.name = "manuushi"
        array.add(model)

        var mode2 = recyalemodel()
        mode2.name = "manusho"
        array.add(mode2)

        var mode3 = recyalemodel()
        mode3.name = "Divyooo"
        array.add(mode3)



        var layoutmanager:RecyclerView.LayoutManager=LinearLayoutManager(this)
        rv_item_recycleactivity.layoutManager = layoutmanager
        var adapter = recycleadapter(this, array)
        rv_item_recycleactivity.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater:MenuInflater = MenuInflater(this)
            inflater.inflate(R.menu.optionmenu, menu)

        var searchitem= menu?.findItem(R.id.action_search)
        var searchview= searchitem?.actionView as? SearchView

        searchview!!.setOnQueryTextListener(object :SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                if(p0.equals(" ")&& p0==null){
                    rv_item_recycleactivity.visibility= View.GONE
                }
                else{
                    rv_item_recycleactivity.visibility = View.VISIBLE
                    var temp:ArrayList<recyalemodel> = ArrayList()
                    for(i in 0 .. array.size-1){
                      if(array.get(i).name.contains(p0.toString(),ignoreCase = true)){
                            temp.add(array.get(i))
                      }
                    }
                    var layoutmanager:RecyclerView.LayoutManager=LinearLayoutManager(this@RecycleActivity)
                    rv_item_recycleactivity.layoutManager = layoutmanager
                    var adapter = recycleadapter(this@RecycleActivity, temp)
                    rv_item_recycleactivity.adapter = adapter
                    adapter.notifyDataSetChanged()
                }
                return  true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                if(p0.equals(" ")&& p0==null){
                    rv_item_recycleactivity.visibility= View.GONE
                }
                else{
                    rv_item_recycleactivity.visibility = View.VISIBLE
                    var temp:ArrayList<recyalemodel> = ArrayList()
                    for(i in 0 .. array.size-1){
                        if(array.get(i).name.contains(p0.toString(),ignoreCase = true)){
                            temp.add(array.get(i))
                        }
                    }
                    var layoutmanager:RecyclerView.LayoutManager=LinearLayoutManager(this@RecycleActivity)
                    rv_item_recycleactivity.layoutManager = layoutmanager
                    var adapter = recycleadapter(this@RecycleActivity, temp)
                    rv_item_recycleactivity.adapter = adapter
                    adapter.notifyDataSetChanged()
                }
                return  true
            }
        })
        return true
    }
}

