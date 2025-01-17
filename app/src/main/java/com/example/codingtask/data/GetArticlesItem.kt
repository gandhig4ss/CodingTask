package com.example.codingtask.data

import FlareTag

data class GetArticlesItem(
    val canonical_url: String,
    val collection_id: Int,
    val comments_count: Int,
    val cover_image: String,
    val created_at: String,
    val crossposted_at: Any,
    val description: String,
    val edited_at: String,
    val flare_tag: FlareTag,
    val id: Int,
    val last_comment_at: String,
    val organization: Organization,
    val path: String,
    val positive_reactions_count: Int,
    val public_reactions_count: Int,
    val published_at: String,
    val published_timestamp: String,
    val readable_publish_date: String,
    val reading_time_minutes: Int,
    val slug: String,
    val social_image: String,
    val tag_list: List<String>,
    val tags: String,
    val title: String,
    val type_of: String,
    val url: String,
    val user: User
)