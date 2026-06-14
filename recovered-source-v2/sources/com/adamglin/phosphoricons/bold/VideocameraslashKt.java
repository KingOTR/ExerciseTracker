package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Videocameraslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VideoCameraSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getVideoCameraSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_videoCameraSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideocameraslashKt {
    private static ImageVector _videoCameraSlash;

    public static final ImageVector getVideoCameraSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _videoCameraSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("VideoCameraSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(249.45f, 69.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.51f, 1.0f);
        pathBuilder.lineTo(212.0f, 88.43f);
        pathBuilder.verticalLineTo(72.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.horizontalLineTo(123.88f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineTo(188.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.46f, 9.33f);
        pathBuilder.curveToRelative(0.15f, 0.13f, 0.31f, 0.25f, 0.48f, 0.38f);
        pathBuilder.lineToRelative(44.0f, 32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 256.0f, 176.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 249.45f, 69.31f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 152.43f);
        pathBuilder.lineToRelative(-20.0f, -14.54f);
        pathBuilder.verticalLineTo(118.11f);
        pathBuilder.lineToRelative(20.0f, -14.54f);
        pathBuilder.close();
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f);
        pathBuilder.lineTo(42.69f, 52.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 72.0f);
        pathBuilder.verticalLineTo(184.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(180.87f);
        pathBuilder.lineToRelative(18.25f, 20.07f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 180.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.horizontalLineTo(64.51f);
        pathBuilder.lineToRelative(94.55f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _videoCameraSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
