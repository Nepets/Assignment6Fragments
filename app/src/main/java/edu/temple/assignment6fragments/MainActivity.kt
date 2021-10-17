package edu.temple.assignment6fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var selectionFrag: SelectionFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.title = resources.getString(R.string.selection_name)

        //val mangaData: Array<ImageObject> = getData()
        val mangaNames = resources.getStringArray(R.array.manga_names)
        val mangaImage: IntArray = intArrayOf(R.drawable.blackclover,R.drawable.chainsawman,
            R.drawable.demonslayer,R.drawable.drstone,R.drawable.dragonball,R.drawable.haikyuu,
            R.drawable.juju,R.drawable.onepunch, R.drawable.seraphend,R.drawable.magi,R.drawable.naruto,
            R.drawable.boruto)

        selectionFrag = SelectionFragment.newInstance(mangaNames,mangaImage)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView, selectionFrag)
            .commit()

    }
    private fun getData(): Array<ImageObject> {
        val mangaNames = resources.getStringArray(R.array.manga_names)
        return arrayOf(ImageObject(mangaNames[0], R.drawable.blackclover), ImageObject(mangaNames[1].toString(),R.drawable.chainsawman),
            ImageObject(mangaNames[2], R.drawable.demonslayer), ImageObject(mangaNames[3],R.drawable.drstone),
            ImageObject(mangaNames[4],R.drawable.dragonball), ImageObject(mangaNames[5],R.drawable.haikyuu),
            ImageObject(mangaNames[6],R.drawable.juju), ImageObject(mangaNames[7],R.drawable.onepunch),
            ImageObject(mangaNames[8], R.drawable.seraphend), ImageObject(mangaNames[9],R.drawable.magi),
            ImageObject(mangaNames[10],R.drawable.naruto),ImageObject(mangaNames[11],R.drawable.boruto))

    }
}