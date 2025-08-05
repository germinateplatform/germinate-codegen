package jhi.germinate.server.database.pojo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author Sebastian Raubach
 */
@NoArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class Exif
{
	private String apertureValue;
	private String cameraMake;
	private String cameraModel;
	private String colorSpace;
	private String compression;
	private String contrast;
	private Date   dateTime;
	private Date   dateTimeOriginal;
	private Date   dateTimeDigitized;
	private String digitalZoomRatio;
	private String exifImageHeight;
	private String exifImageWidth;
	private String exifVersion;
	private String exposure;
	private String exposureBiasValue;
	private String exposureMode;
	private String exposureProgram;
	private String exposureTime;
	private String fileSource;
	private String flash;
	private String fNumber;
	private String focalLength;
	private String gainControl;
	private Double gpsAltitude;
	private Double gpsLatitude;
	private Double gpsLongitude;
	private Date   gpsTimestamp;
	private String imageHeight;
	private String imageWidth;
	private String isoSpeedRatings;
	private String lensMake;
	private String lensModel;
	private String meteringMode;
	private String orientation;
	private Integer orientationCode;
	private String photometricInterpretation;
	private String samplesPerPixel;
	private String saturation;
	private String sceneCaptureType;
	private String sceneType;
	private String sensingMethod;
	private String sharpness;
	private String shutterSpeedValue;
	private String userComment;
	private String whiteBalance;
	private String whiteBalanceMode;
	private String xResolution;
	private String yResolution;
}
