package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cloudarrowup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudArrowUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCloudArrowUp", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudArrowUp", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudarrowupKt {
    private static ImageVector _cloudArrowUp;

    public static final ImageVector getCloudArrowUp(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _cloudArrowUp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudArrowUp", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(178.34f, 165.66f);
        pathBuilder.lineTo(160.0f, 147.31f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(147.31f);
        pathBuilder.lineToRelative(-18.34f, 18.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 40.0f);
        pathBuilder.arcTo(88.08f, 88.08f, 0.0f, false, false, 81.29f, 88.68f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, true, false, 72.0f, 216.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.2f, 0.0f, 3.29f, 0.12f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, false, 72.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, true, true, 100.8f, 66.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.2f, 15.34f);
        pathBuilder.arcToRelative(7.9f, 7.9f, 0.0f, false, false, 3.2f, -0.68f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, false, 160.0f, 40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudArrowUp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
