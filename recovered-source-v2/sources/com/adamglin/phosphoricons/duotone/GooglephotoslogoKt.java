package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Googlephotoslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GooglePhotosLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGooglePhotosLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googlePhotosLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglephotoslogoKt {
    private static ImageVector _googlePhotosLogo;

    public static final ImageVector getGooglePhotosLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _googlePhotosLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GooglePhotosLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.0f, 88.0f);
        pathBuilder.arcToRelative(63.69f, 63.69f, 0.0f, false, true, -14.0f, 40.0f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, true, 192.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 168.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f);
        pathBuilder.verticalLineTo(128.0f);
        pathBuilder.horizontalLineTo(78.0f);
        pathBuilder.arcTo(63.69f, 63.69f, 0.0f, false, false, 64.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(232.0f, 120.0f);
        pathBuilder2.lineTo(192.49f, 120.0f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.lineTo(120.0f, 63.51f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, false, 16.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.lineTo(63.51f, 136.0f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 240.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.lineTo(136.0f, 192.49f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, false, 240.0f, 128.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 223.43f);
        pathBuilder2.arcTo(56.09f, 56.09f, 0.0f, false, true, 72.0f, 168.0f);
        pathBuilder2.arcToRelative(55.31f, 55.31f, 0.0f, false, true, 10.0f, -32.0f);
        pathBuilder2.horizontalLineToRelative(38.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 120.0f);
        pathBuilder2.lineTo(32.57f, 120.0f);
        pathBuilder2.arcTo(56.09f, 56.09f, 0.0f, false, true, 88.0f, 72.0f);
        pathBuilder2.arcToRelative(55.31f, 55.31f, 0.0f, false, true, 32.0f, 10.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(136.0f, 32.57f);
        pathBuilder2.arcTo(56.09f, 56.09f, 0.0f, false, true, 184.0f, 88.0f);
        pathBuilder2.arcTo(55.31f, 55.31f, 0.0f, false, true, 174.0f, 120.0f);
        pathBuilder2.lineTo(136.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.0f, 184.0f);
        pathBuilder2.arcTo(55.31f, 55.31f, 0.0f, false, true, 136.0f, 174.0f);
        pathBuilder2.lineTo(136.0f, 136.0f);
        pathBuilder2.horizontalLineToRelative(87.43f);
        pathBuilder2.arcTo(56.09f, 56.09f, 0.0f, false, true, 168.0f, 184.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googlePhotosLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
