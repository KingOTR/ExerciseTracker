package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Mailbox.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Mailbox", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMailbox", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mailbox", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MailboxKt {
    private static ImageVector _mailbox;

    public static final ImageVector getMailbox(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _mailbox;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Mailbox", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(102.0f, 152.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(56.0f, 158.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(96.0f, 146.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 102.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.0f, 116.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.lineTo(134.0f, 190.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 190.0f);
        pathBuilder.lineTo(32.0f, 190.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.lineTo(18.0f, 116.0f);
        pathBuilder.arcTo(58.07f, 58.07f, 0.0f, false, true, 76.0f, 58.0f);
        pathBuilder.horizontalLineToRelative(78.0f);
        pathBuilder.lineTo(154.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(166.0f, 30.0f);
        pathBuilder.lineTo(166.0f, 58.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.arcTo(58.07f, 58.07f, 0.0f, false, true, 238.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 178.0f);
        pathBuilder.lineTo(122.0f, 116.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 116.0f);
        pathBuilder.arcToRelative(46.06f, 46.06f, 0.0f, false, false, -46.0f, -46.0f);
        pathBuilder.lineTo(166.0f, 70.0f);
        pathBuilder.verticalLineToRelative(74.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(154.0f, 70.0f);
        pathBuilder.lineTo(111.29f, 70.0f);
        pathBuilder.arcTo(57.93f, 57.93f, 0.0f, false, true, 134.0f, 116.0f);
        pathBuilder.verticalLineToRelative(62.0f);
        pathBuilder.horizontalLineToRelative(90.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mailbox = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
