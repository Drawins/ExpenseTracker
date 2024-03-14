package com.example.expensetracker.RoomDataBase

import android.os.Parcel
import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Income(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val amount: String?
): Parcelable {
    companion object {
        @JvmField
        val CREATOR = object: Parcelable.Creator<Income>{
            override fun createFromParcel(source: Parcel): Income {
                return Income(source.readInt(),source.readString()?:"")
            }

            override fun newArray(size: Int): Array<Income?> {
                return arrayOfNulls(size)
            }

        }
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeInt(id)
        dest.writeString(amount)
    }
}

