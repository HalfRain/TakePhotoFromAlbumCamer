package com.weitf.album.photo;

import android.graphics.Bitmap;

import java.io.Serializable;

public class ThumbBean implements Serializable {
	private String url;
	private String image_path;
	private String large_image_path;
	private Bitmap bitmap;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public String getLarge_image_path() {
		return large_image_path;
	}

	public void setLarge_image_path(String large_image_path) {
		this.large_image_path = large_image_path;
	}

	public Bitmap getBitmap() {
		return bitmap;
	}

	public void setBitmap(Bitmap bitmap) {
		this.bitmap = bitmap;
	}
	//	public ThumbBean(int image_id, String image_path, String large_image_path) {
//		super();
//		this.image_id = image_id;
//		this.image_path = image_path;
//		this.large_image_path = large_image_path;
//	}

	public ThumbBean( String url, String image_path, String large_image_path) {
		super();
		this.url = url;
		this.image_path = image_path;
		this.large_image_path = large_image_path;
	}

	@Override
	public boolean equals(Object o) {
		return o instanceof ThumbBean && ((ThumbBean) o).getImage_path().equals(this.image_path);
	}

	@Override
	public int hashCode() {
		return image_path.hashCode();
	}

}
