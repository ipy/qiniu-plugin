package net.zouxin.lab.qiniuplugin;

import org.kohsuke.stapler.DataBoundConstructor;

public class QiniuEntry {
	public String profileName, source, bucket, formatKey;
	public boolean noUploadOnFailure;

	public QiniuEntry() {
	}

	@DataBoundConstructor
	public QiniuEntry(String profileName, String source, String bucket,
			boolean noUploadOnFailure, String formatKey) {
		this.profileName = profileName;
		this.source = source;
		this.bucket = bucket;
		this.noUploadOnFailure = noUploadOnFailure;
		this.formatKey = formatKey;
	}

}
