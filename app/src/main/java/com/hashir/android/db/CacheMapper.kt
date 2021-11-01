package com.hashir.android.db

import com.hashir.android.modules.curatedList.model.Photo
import com.hashir.android.util.EntityMapper
import javax.inject.Inject

class CacheMapper
@Inject constructor() : EntityMapper<PhotoEntity, Photo> {
    override fun mapFromEntity(entity: PhotoEntity): Photo {
        return Photo(
            id = entity.id,
            liked = true,
            url = entity.url,
            large = entity.large,
            medium = entity.medium,
            original = entity.original,
            small = entity.small,
            photographerName = entity.photographerName
        )
    }

    override fun mapToEntity(domainModel: Photo): PhotoEntity {
        return PhotoEntity(
            id = domainModel.id ?: -1,
            url = domainModel.url,
            large = domainModel.large,
            medium = domainModel.medium,
            original = domainModel.original,
            small = domainModel.small,
            photographerName = domainModel.photographerName
        )
    }

    fun mapFromEntityList(entities: List<PhotoEntity>): List<Photo> {
        return entities.map { mapFromEntity(it) }
    }
}