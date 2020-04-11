package net.maddeveloper.roomarraylistconverterfactory


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import java.io.Serializable

@Entity
data class responseEntity(
    @Embedded(prefix = "statusResponse_")var statusResponse: StatusResponse?=null,
    @TypeConverters
        (DataConverter::class)
    @SerializedName("studentSubjectDTOList")var studentSubjectDTOList: List<StudentSubjectDTO?>?=null
):Serializable {


    @Keep
    data class StatusResponse(
        @SerializedName("message") var message: String?=null,
        @SerializedName("status") var status: String?=null,
        @SerializedName("statusCode") var statusCode: String?=null,
        @SerializedName("userType") var userType: String?=null
    )

    @Keep
    data class StudentSubjectDTO(
        @SerializedName("bgColor") var bgColor: String?=null,
        @SerializedName("imgURl") var imgURl: String?=null,
        @SerializedName("moduleName") var moduleName: String?=null,
        @SerializedName("standardId") var standardId: String?=null,
        @SerializedName("standardName") var standardName: String?=null,
        @SerializedName("studentId") var studentId: Int?=null,
        @SerializedName("subjectCode") var subjectCode: String?=null,
        @SerializedName("subjectCreditId") var subjectCreditId: String?=null,
        @SerializedName("subjectDesc") var subjectDesc: String?=null,
        @SerializedName("subjectIcon") var subjectIcon: String?=null,
        @SerializedName("subjectId") var subjectId: Int?=null,
        @SerializedName("subjectName") var subjectName: String?=null,
        @SerializedName("subjectPlacementId") var subjectPlacementId: String?=null,
        @SerializedName("subjectRating") var subjectRating: Int?=null,
        @SerializedName("subjectTitle") var subjectTitle: String?=null,
        @SerializedName("userId") var userId: Int?=null
    )

    @PrimaryKey(autoGenerate = true)
    var id : Int = 0
}