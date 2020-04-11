package net.maddeveloper.roomarraylistconverterfactory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch
import net.maddeveloper.roomarraylistconverterfactory.room.NoteDatabase

class MainActivity : BaseFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var res="{\n" +
                "  \"statusResponse\": {\n" +
                "    \"status\": \"SUCCESS\",\n" +
                "    \"userType\": null,\n" +
                "    \"statusCode\": \"1\",\n" +
                "    \"message\": null\n" +
                "  },\n" +
                "  \"studentSubjectDTOList\": [\n" +
                "    {\n" +
                "      \"userId\": 218,\n" +
                "      \"studentId\": 111,\n" +
                "      \"standardId\": null,\n" +
                "      \"standardName\": \"GRADE-11\",\n" +
                "      \"imgURl\": \"/istest/static/img/subjects/Language-Arts.jpg\",\n" +
                "      \"subjectId\": 276,\n" +
                "      \"subjectCreditId\": null,\n" +
                "      \"subjectPlacementId\": null,\n" +
                "      \"subjectCode\": null,\n" +
                "      \"subjectName\": \"HSLA 03 - Language Arts 11\",\n" +
                "      \"moduleName\": null,\n" +
                "      \"subjectTitle\": \"Language Arts 11\",\n" +
                "      \"subjectIcon\": \"Language-Arts.jpg\",\n" +
                "      \"subjectDesc\": \"\",\n" +
                "      \"subjectRating\": 0,\n" +
                "      \"bgColor\": \"bg-primary\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"userId\": 218,\n" +
                "      \"studentId\": 111,\n" +
                "      \"standardId\": null,\n" +
                "      \"standardName\": \"GRADE-11\",\n" +
                "      \"imgURl\": \"/istest/static/img/subjects/Algebra-1.jpg\",\n" +
                "      \"subjectId\": 277,\n" +
                "      \"subjectCreditId\": null,\n" +
                "      \"subjectPlacementId\": null,\n" +
                "      \"subjectCode\": null,\n" +
                "      \"subjectName\": \"HSA 01 - Algebra 1 A-B\",\n" +
                "      \"moduleName\": null,\n" +
                "      \"subjectTitle\": \"Algebra 1 A-B\",\n" +
                "      \"subjectIcon\": \"Algebra-1.jpg\",\n" +
                "      \"subjectDesc\": \"\",\n" +
                "      \"subjectRating\": 0,\n" +
                "      \"bgColor\": \"bg-success\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"userId\": 218,\n" +
                "      \"studentId\": 111,\n" +
                "      \"standardId\": null,\n" +
                "      \"standardName\": \"GRADE-11\",\n" +
                "      \"imgURl\": \"/istest/static/img/subjects/Health.jpg\",\n" +
                "      \"subjectId\": 358,\n" +
                "      \"subjectCreditId\": null,\n" +
                "      \"subjectPlacementId\": null,\n" +
                "      \"subjectCode\": null,\n" +
                "      \"subjectName\": \"HSH 01 - Health A-B\",\n" +
                "      \"moduleName\": null,\n" +
                "      \"subjectTitle\": \"Health A-B\",\n" +
                "      \"subjectIcon\": \"Health.jpg\",\n" +
                "      \"subjectDesc\": \"\",\n" +
                "      \"subjectRating\": 0,\n" +
                "      \"bgColor\": \"bg-info\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"userId\": 218,\n" +
                "      \"studentId\": 111,\n" +
                "      \"standardId\": null,\n" +
                "      \"standardName\": \"GRADE-11\",\n" +
                "      \"imgURl\": \"/istest/static/img/subjects/Psychology.jpg\",\n" +
                "      \"subjectId\": null,\n" +
                "      \"subjectCreditId\": 486,\n" +
                "      \"subjectPlacementId\": null,\n" +
                "      \"subjectCode\": null,\n" +
                "      \"subjectName\": \"HSP 08CR - CR Psychology\",\n" +
                "      \"moduleName\": null,\n" +
                "      \"subjectTitle\": \"CR Psychology\",\n" +
                "      \"subjectIcon\": \"Psychology.jpg\",\n" +
                "      \"subjectDesc\": \"\",\n" +
                "      \"subjectRating\": 0,\n" +
                "      \"bgColor\": \"bg-warning\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"userId\": 218,\n" +
                "      \"studentId\": 111,\n" +
                "      \"standardId\": null,\n" +
                "      \"standardName\": \"GRADE-11\",\n" +
                "      \"imgURl\": \"/istest/static/img/subjects/Art History.jpg\",\n" +
                "      \"subjectId\": null,\n" +
                "      \"subjectCreditId\": 683,\n" +
                "      \"subjectPlacementId\": null,\n" +
                "      \"subjectCode\": null,\n" +
                "      \"subjectName\": \"HSAH 02CR - CR Art History\",\n" +
                "      \"moduleName\": null,\n" +
                "      \"subjectTitle\": \"CR Art History\",\n" +
                "      \"subjectIcon\": \"Art History.jpg\",\n" +
                "      \"subjectDesc\": \"\",\n" +
                "      \"subjectRating\": 0,\n" +
                "      \"bgColor\": \"bg-danger\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"userId\": null,\n" +
                "      \"studentId\": 111,\n" +
                "      \"standardId\": null,\n" +
                "      \"standardName\": null,\n" +
                "      \"imgURl\": \"/istest/static/img/subjects/World History.jpg\",\n" +
                "      \"subjectId\": null,\n" +
                "      \"subjectCreditId\": null,\n" +
                "      \"subjectPlacementId\": 9,\n" +
                "      \"subjectCode\": \"HSWH 01AP\",\n" +
                "      \"subjectName\": \"AP World History\",\n" +
                "      \"moduleName\": null,\n" +
                "      \"subjectTitle\": \"\",\n" +
                "      \"subjectIcon\": \"World History.jpg\",\n" +
                "      \"subjectDesc\": \"\",\n" +
                "      \"subjectRating\": 0,\n" +
                "      \"bgColor\": \"bg-primary\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"userId\": null,\n" +
                "      \"studentId\": 111,\n" +
                "      \"standardId\": null,\n" +
                "      \"standardName\": null,\n" +
                "      \"imgURl\": \"/istest/static/img/subjects/Biology.jpg\",\n" +
                "      \"subjectId\": null,\n" +
                "      \"subjectCreditId\": null,\n" +
                "      \"subjectPlacementId\": 7,\n" +
                "      \"subjectCode\": \"HSB 01AP\",\n" +
                "      \"subjectName\": \"AP Biology\",\n" +
                "      \"moduleName\": null,\n" +
                "      \"subjectTitle\": \"\",\n" +
                "      \"subjectIcon\": \"Biology.jpg\",\n" +
                "      \"subjectDesc\": \"\",\n" +
                "      \"subjectRating\": 0,\n" +
                "      \"bgColor\": \"bg-success\"\n" +
                "    }\n" +
                "  ]\n" +
                "}"
        var response= Gson().fromJson(res,responseEntity::class.java)
        Log.v("ppppp",response.toString())
        launch {
            applicationContext?.let {
                NoteDatabase(applicationContext).getNoteDao().addNote(response)
                Toast.makeText(applicationContext,"responseSaved",Toast.LENGTH_SHORT).show()
                var datares=NoteDatabase(applicationContext).getNoteDao().getAllNotes()
                tv.setText(datares.toString())

            }}



    }
}
