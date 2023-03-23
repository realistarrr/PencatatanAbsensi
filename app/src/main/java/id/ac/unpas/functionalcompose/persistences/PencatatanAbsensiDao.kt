package id.ac.unpas.functionalcompose.persistences


import androidx.lifecycle.LiveData
import androidx.room.*
import id.ac.unpas.functionalcompose.model.PencatatanAbsensi

@Dao
interface PencatatanAbsensiDao {


    @Query("SELECT * FROM PencatatanAbsensi")
    fun loadAll(): LiveData<List<PencatatanAbsensi>>
    @Query("SELECT * FROM PencatatanAbsensi WHERE id = :id")
    fun find(id: String): PencatatanAbsensi?
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(vararg items: PencatatanAbsensi)
    @Delete
    fun delete(item: PencatatanAbsensi)
}